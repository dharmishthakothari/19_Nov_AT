package com.pkgCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(12);
		lst.add(0);
		lst.add(99);
		lst.add(333);
		
		int sum=0;
		Iterator i=lst.iterator();
		while(i.hasNext())
		{
			Integer e=(Integer)i.next();
			//to convert into integer
			
			sum+=e;
		}
		System.out.println("Sum of Elements "+sum);

	}

}
