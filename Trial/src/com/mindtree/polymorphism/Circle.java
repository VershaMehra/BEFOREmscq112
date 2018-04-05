package com.mindtree.polymorphism;

public class Circle extends Shape {
double radius;
	public Circle(double radius) {
		this.radius=radius;
	}

	@Override
	void display() {
System.out.println("area of circle"+area);
	}

	@Override
	void calculate() {
area=3.14*radius*radius;
	}

}
