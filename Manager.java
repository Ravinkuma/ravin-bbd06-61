package com.java.coding.practice61;

public class Manager extends Employees {
	
	int teamSize;

	public Manager(String name, int age, int empId, String department, int teamSize) {
		super(name, age, empId, department);
		this.teamSize = teamSize;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Size of team: "+teamSize);
	}

}
