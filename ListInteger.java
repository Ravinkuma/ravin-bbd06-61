package com.java.coding.practice61;

import java.util.LinkedList;
import java.util.List;

public class ListInteger {
	public static void main(String []args) {
	List<Integer>RollNumOfStudents=new LinkedList<>();
	// i want to create a method and call in main class
	RollNumOfStudents.add(1);
	RollNumOfStudents.add(2);
	RollNumOfStudents.add(3);
	RollNumOfStudents.add(4);
	RollNumOfStudents.add(5);
	System.out.println("list of rollNum of students:");
	for(Integer i: RollNumOfStudents) {
		System.out.println(i);
	}
	}
}

