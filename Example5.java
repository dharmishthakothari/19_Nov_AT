package com.pkgCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lst=new ArrayList<Integer>();
		lst.add(12);
		lst.add(22);
		lst.add(900);
		lst.add(22);
		lst.add(23);
		System.out.println(lst);
		Set set=new HashSet(lst);
		System.out.println(set);
		
		//loop for each 
		for(Integer i:lst)
		{
			System.out.println(i);
		}
		System.out.println("Set elements ");
		for(Object i:set)
		{
			System.out.println(i);
		}
		
		
	}

}
