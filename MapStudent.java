package com.java.coding.practice61;

import java.util.HashMap;
import java.util.Map;

public class MapStudent {
	public static void main(String args[]) {
		Map<String, Integer> NameRoll=new HashMap<>();
		NameRoll.put("John", 5);
		NameRoll.put("Johny", 07);
		NameRoll.put("Mariya",11);
		NameRoll.put("Sumit", 15);
		NameRoll.put("Amit", 18);
		
		System.out.println("key and value of Map: ");
		// why mariya is on top in output
		for(Map.Entry<String, Integer> ent: NameRoll.entrySet()) {
			System.out.println("key: "+ent.getKey()+ " value: "+ent.getValue());
		}
	}

}
