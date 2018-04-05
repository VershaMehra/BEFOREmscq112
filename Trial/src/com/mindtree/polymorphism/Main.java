package com.mindtree.polymorphism;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		Shape ref;
		
		 ref=new Square(5);
		 
		 ref.calculate();
		 ref.display();
		 
		 
		 ref=new Rectangle(5.1,6.6);
		 
		 ref.calculate();
		 ref.display();
		
		 
		 ref=new Circle(7);
		 
		 ref.calculate();
		 ref.display();

	}

}
