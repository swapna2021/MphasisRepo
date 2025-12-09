package com.mphasis;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AsyncServlet
 */
@WebServlet(urlPatterns="/AsyncServlet",asyncSupported=true)
public class AsyncServlet extends HttpServlet implements Servlet  {
	private static final long serialVersionUID = 1L;
	
	
	private static final ExecutorService executorPool = Executors.newFixedThreadPool(3);
	
	
	@Override
		public void destroy() {
			executorPool.shutdown();
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(Thread.currentThread().getName()+"  "+Thread.currentThread().getState());
		
		 AsyncContext ac=request.startAsync();
		 
		 
		executorPool.submit(()->{
			
			try {
				Thread.sleep(1000);
				
				String uname=request.getParameter("uname");
				String pwd=request.getParameter("pwd");
				
				if(uname.equals("swapna") && pwd.equals("swapna")) {
					response.getWriter().println("Authentication successfull,Async login ok");
				}
				else
					response.getWriter().println("Invalid credentials,Async login failed");	
				
				System.out.println(Thread.currentThread().getName());
			
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			finally {
				 ac.complete();
			}
		});
		
		
	}

}
