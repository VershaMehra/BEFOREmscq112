package com.mindtree.polymorphism;

public class Square extends Shape {
	double side;

	public Square(double side) {
			this.side=side;
	}

	@Override
	void display() {
		System.out.println("area is" + area);
	}

	@Override
	void calculate() {
		area = side * side;
	}

}
