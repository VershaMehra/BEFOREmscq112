package com.mindtree.trialinterface;

public class Axis implements Bank {

	double amt;
	@Override
	public void withdraw() {
		 amt = amount-1000;
	}

	@Override
	public void display() {
		System.out.println(amt);
	}

	
	
}
