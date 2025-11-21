package com.mphasis;

public class BankingApp {

	public static void main(String[] args) {
		
		SavingAccount sa=new SavingAccount(34567821, "Swapna Motupally", "ICICI","ICIC0000069" ,"Habsiguda" , 1000);
		System.out.println(sa);
		sa.withDraw(5000);
		sa.deposit(20000);
		sa.withDraw(5000);
		System.out.println(sa.checkBalance());
		System.out.println(sa);
		
		
		//Account acc=new Account();
				

	}

}
