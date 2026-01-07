package com.pkgCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List lst=new ArrayList();
		lst.add("123");
		lst.add(234);
		lst.add("Hello");
		lst.add(23.45f);
		lst.add("123");
		lst.add(234);
		lst.add("Hello");
		lst.add(23.45f);
		System.out.println(lst);
		Iterator i=lst.iterator();
		while(i.hasNext())
		{
			
			Object o=i.next();
			if(o instanceof Float)
			{
				System.out.println(o);
			}
		}
		
	}

}
