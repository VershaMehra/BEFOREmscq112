package com.mindtree.trialinterface;

public class Hdfc implements Bank{
	double amt;
	@Override
	public void withdraw() {
		 amt = amount-2000;
	}

	@Override
	public void display() {
		System.out.println(amt);
	}

}
