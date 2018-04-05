package com.mindtree.polymorphism;

public class Rectangle extends Shape {
	double length;
	double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	void display() {
		System.out.println("Area is" + area);
	}

	@Override
	void calculate() {
		area = length * breadth;
	}

}
