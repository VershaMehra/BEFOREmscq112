package com.mindtree.objectscreation;

public  class CountNoOfObjects {
	
	 static int count=0;
	
	
public CountNoOfObjects()
	{
		count++;
	}
	 
	/* public CountNoOfObjects(int a)
	 {
		 
	 }
	*/
	public void display(){
		System.out.println(count);
	}

}
