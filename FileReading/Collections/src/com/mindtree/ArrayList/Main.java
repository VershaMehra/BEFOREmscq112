package com.mindtree.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Student st1=new Student(1,"versha","Delhi");
		Student st2=new Student(2,"mehra","dehradun");
		
		ArrayList<Student> al=new ArrayList<Student>();
		ArrayList<Student> al2=new ArrayList<Student>();
		
		al.add(st1);
		al.add(st2);
		
	
		//System.out.println(al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Student ob=(Student) itr.next();
			System.out.println(ob.rollno+ob.name+ob.state);
		}
		/*for(String s:al)
			System.out.println(s);*/
	}

}
