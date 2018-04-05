package com.mindtree.options;

public class Bank implements Options{
	 double total_amount=1000;

	@Override
	public void display() {
		System.out.println("current bal is"+total_amount);
	}

	@Override
	public void withdraw(double amount) throws WithdrawException {
		
		if (amount < 0) {
			throw new WithdrawException("amount is less than 0");
			
		} 
		total_amount=total_amount-amount;
		System.out.println("current bal is"+total_amount);
	}

	@Override
	public void deposit(double amount) {
		total_amount=total_amount+amount;
		System.out.println("current bal is"+total_amount);
	
		
	}

	

	
	

	

}
