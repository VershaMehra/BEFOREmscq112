package com.mindtree.options;

public interface Options {
	
	
	void display();
	
	void withdraw(double amount) throws WithdrawException ;
	void deposit(double amount);

}
