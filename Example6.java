package com.pkgCollection;

import java.util.HashMap;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map=new HashMap();
		map.put(1, "Ahmedbad");
		map.put(2, "Surat");
		map.put("Baroda", 3);
		System.out.println(map);
		map.put(2, "Bhavnagar");
		map.put(5, "Bhavnagar");
		System.out.println(map);
		
		
		HashMap<String, Long> name_co=new HashMap<String, Long>() ;
		name_co.put("Shahid",45678990L);
		name_co.put("Avani",45678230L);
		name_co.put("Dhruvi",678990L);
		name_co.put("Dharmishtha",8678990L);
		
		//fetch keys
		System.out.println(name_co.keySet());
		System.out.println(name_co.values());
		
		
	}

}
