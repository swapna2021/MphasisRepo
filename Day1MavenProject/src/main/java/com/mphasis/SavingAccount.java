package com.mphasis;

public class SavingAccount extends Account {
	
	private double balance;

	public SavingAccount(long accNo, String accHolderName, String bankname, String iFSC, String branchName,
			double balance) {
		super(accNo, accHolderName, bankname, iFSC, branchName);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", AccNo=" + getAccNo() + ", AccHolderName="
				+ getAccHolderName() + ", Bankname=" + getBankname() + ", IFSC=" + getiFSC()
				+ ", BranchName=" + getBranchName() + ", Pin=" + getPin() + "]";
	}
	
	
	public void withDraw(double amount) throws InsufficientFundsExceptions {
		if(amount<this.balance) {
			this.balance=this.balance-amount;
			System.out.println("Withdraw Successfull");
		}
		else
			throw new InsufficientFundsExceptions("amount is more than existing balance");
	}
	
	public void deposit(double amount) {
		this.balance=this.balance+amount;
		System.out.println("deposited");
		
	}
	
	//code for changePin and generatePin....
	
	public double checkBalance() {
		return this.getBalance();
	}
	
	

}
