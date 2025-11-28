package com.mphasis;

public class RunnableDemo  implements Runnable{

	public static void main(String[] args) {
		
		Thread t=new Thread(new RunnableDemo());
		t.start();
	}

	@Override
	public void run() {
		System.out.println( "thread "+Thread.currentThread().getName()+" running");
		
	}

}
