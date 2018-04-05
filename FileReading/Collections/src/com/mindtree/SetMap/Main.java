package com.mindtree.SetMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("versha");
		al.add("sonu");
		al.add("monu");
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		Iterator itr=hs.iterator();
		Iterator itr1=al.iterator();
		while(itr.hasNext()&& itr1.hasNext()){
		
		hm.put((Integer)itr.next(),(String)itr1.next());
		
		}
		System.out.println(hm);
		
		
		
	}
}
