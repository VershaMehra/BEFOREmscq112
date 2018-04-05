package com.mindtree.trialinterface;

public class Kotak implements Bank{
	double amt;
	@Override
	public void withdraw() {
		 amt = amount-4000;
	}

	@Override
	public void display() {
		System.out.println(amt);
	}
}
