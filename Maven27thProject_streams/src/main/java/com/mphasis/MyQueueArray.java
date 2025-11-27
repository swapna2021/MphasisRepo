package com.mphasis;

public class MyQueueArray {
	
	private static int front=-1;
	private static int rear=-1;
	private static int[] queue=new int[10];
	
	public static boolean isEmpty() {
		if(front==-1||front>rear)
			return true;
		return false;
					
	}
	
	public static boolean isFull() {
		return rear==queue.length-1;
	}
	
	public static void insert(int data) {
		
		if(isFull()) {
			System.out.println("queue is full");
		}
		else
		if(rear==-1) {
			front=0;
			queue[++rear]=data;
		}
		else
			queue[++rear]=data;	
		System.out.println(data+" inserted successfully");	
	}
	public static void delete() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			front=rear=-1;
		}
		else
		{
			System.out.println("Element deleted : "+queue[front++]);
			if(front>rear)
				front=rear=-1;
		}	
	}
	
	public static void display() {
		
		if(isEmpty())
			System.out.println("no data in the queue");
		else
		for(int i=front;i<=rear;i++)
			System.out.println(queue[i]);
	}
	
	public static void main(String[] args) {
		delete();
		insert(10);
		display();

		delete();
		display();
		insert(20);
		insert(30);
		insert(40);
		display();
		delete();
		delete();
		delete();
		display();
	}

}
