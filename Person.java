package com.java.coding.practice61;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails() {
		System.out.println("Name of person: "+name);
		System.out.println("Age of person: "+age);
	}

}
