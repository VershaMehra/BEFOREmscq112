package cm.mindtree.countOfOccurence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(in);
		System.out.println("enter 1st string");
		String s1=b.readLine();
		s1=s1.toLowerCase();
		System.out.println("enter 2nd string");
		String s2=b.readLine();
		String arr[]=s1.split(" ");
		
		s2=s2.toLowerCase();
		int count=0;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i].contains(s2))
				count++;
		}
		System.out.println(count);
	}

}
