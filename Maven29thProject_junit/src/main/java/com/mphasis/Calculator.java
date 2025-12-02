package com.mphasis;

public class Calculator {
	
	public int add(int a,int b) {
		return a+b*2;
	}
	
	public boolean isEven(int num) {
		return  num%2!=0;
	}
	
	public int[] checkArrays() {
		
		int arr[]= {1,2,3,4,5};
		
		return arr;
		
	}
	
	public ArithmeticException checkAE() {
		return new ArithmeticException();	
	}

}
