package com.mphasis;

public class Upi implements Payment{

	@Override
	public void pay(double amount) {
		
		if(Payment.validateAmount(amount))
		{
			System.out.println(" Paid "+amount+" using UPI");
			generateReceipt(amount);
		}
		else
		{
			System.out.println("payment failed , Invalid amount");
		}
		
	}
	
	@Override
	public void generateReceipt(double amount) {
		System.out.println("Payment option:UPI");
		Payment.super.generateReceipt(amount);
	}
	
	

}
