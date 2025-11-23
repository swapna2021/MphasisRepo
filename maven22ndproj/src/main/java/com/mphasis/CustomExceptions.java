package com.mphasis;

public class CustomExceptions {

	public static void main(String[] args) throws AgeNOtSufficientException {
		
		
		Person p=new Person("swapna",123,15);
		System.out.println(p);
		p.checkEligibility();
		
		System.out.println("applciation closed");

	}

}
