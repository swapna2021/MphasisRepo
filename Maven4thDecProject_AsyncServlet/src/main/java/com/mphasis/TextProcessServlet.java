package com.mphasis;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TextProcessServlet
 */
@WebServlet(urlPatterns="/TextProcessServlet",asyncSupported=true)
public class TextProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final ExecutorService service=Executors.newFixedThreadPool(3);
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		AsyncContext ac= request.startAsync();
		String str=request.getParameter("str");
		System.out.println(str);
		PrintWriter out=ac.getResponse().getWriter();
		
		Future<String> uppercaseTask = service.submit(() -> {
            try { 
            	Thread.sleep(4000); 
            }
            catch(Exception e){e.printStackTrace();}
            return "Uppercase: " + str.toUpperCase() + " (Thread: " + Thread.currentThread().getName() + ")";
        });

        Future<String> reverseTask = service.submit(() ->
            "Reverse: " + new StringBuilder(str).reverse() + " (Thread: " + Thread.currentThread().getName() + ")"
        ); 

        Future<String> charCountTask =service.submit(() ->
            "Char Count: " + str.length() + " (Thread: " + Thread.currentThread().getName() + ")"
        );
        service.submit(() -> {
            try {
                out.println(uppercaseTask.get());
                out.println(reverseTask.get());
                out.println(charCountTask.get());
                out.println("Final worker thread: " + Thread.currentThread().getName());
            } catch(Exception e){ e.printStackTrace();}
            ac.complete();
        });
    }
	
	@Override
	public void destroy() {
		service.shutdown();
	}

}
