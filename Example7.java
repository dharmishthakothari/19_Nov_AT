package com.pkgCollection;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name;
		//Reverse String
		System.out.println("Enter String ");
		name=scan.next();
		
		StringBuffer sb=new StringBuffer(name);
		System.out.println(sb.reverse());
		
		StringBuilder sb1=new StringBuilder(name);
		System.out.println(sb1.reverse());
		
	}

}
