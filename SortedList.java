package com.java.coding.practice61;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {

	public static void main(String[] args) {
		List<String> printingSortedList = new ArrayList<>();
		printingSortedList.add("Raj");
		printingSortedList.add("Amit");
		printingSortedList.add("Mohit");
		printingSortedList.add("Nilu");
		printingSortedList.add("Developer");
		
		Collections.sort(printingSortedList);
		System.out.println("sorted list: ");
		for(String p: printingSortedList) {
			System.out.println(p);
		}

	}
}
