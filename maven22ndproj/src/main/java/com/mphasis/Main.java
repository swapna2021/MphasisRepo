package com.mphasis;

public class Main {

	public static void main(String[] args) {
		//CreditCard cc=new CreditCard();
		//cc.pay(4500);
		
		//Upi upi=new Upi();
		//upi.pay(50);
		
		
		Payment payment=(amount)->{
			
			if(Payment.validateAmount(amount))
			{
				System.out.println(" Paid "+amount+" using creditcard");
				
			}
			else
			{
				System.out.println("payment failed , Invalid amount");
			}
			
			
		};
		payment.pay(8000);
		
		
		Payment payment1=(amount)->{
			if(Payment.validateAmount(amount))
		
		{
			System.out.println(" Paid "+amount+" using UPI");
			
		}
		else
		{
			System.out.println("payment failed , Invalid amount");
		}
		};
		payment1.pay(8000);
		
		}

}
