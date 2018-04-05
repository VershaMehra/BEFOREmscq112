package com.mindtree.trialinterface;

public class Icici implements Bank{
	double amt;
	@Override
	public void withdraw() {
		 amt = amount-3000;
	}

	@Override
	public void display() {
		System.out.println(amt);
	}
}
