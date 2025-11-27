package com.mphasis;

import java.util.Scanner;

public class MyStack {
	
	private static Node top=null;
	
	public static boolean isEmplty() {
		return top==null;
	}
	public static Node createNode() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter data");
		int data=sc.nextInt();
		return new Node(data);
	}
	public static void push() {
		
		Node newNode=createNode();
		if(top==null)
			top=newNode;
		else
		{
			newNode.setNext(top);
			top=newNode;	
		}
		System.out.println("node with "+newNode.getData()+"inserted into stack successfully");	
	}
	public static void pop() {
		
		if(isEmplty())
			System.out.println("stack underflow");
		else
		{
			System.out.println(top.getData()+" is popped");
			Node temp=top;
			top=top.getNext();
			temp.setNext(null);
		}
	}
	public static void display() {
		if(isEmplty())
			System.out.println("no stack exists");
		else {
			Node temp= top;
			
			while(temp!=null) {
			System.out.print(temp.getData()+"-->");
			temp=temp.getNext();
			}
			System.out.print("null\n");
			
		}
	}
}
