package com.java.coding.practice61;

public class Employees extends Person {
	int empId;
	String department;
	public Employees(String name, int age, int empId, String department) {
		super(name, age);
		this.empId = empId;
		this.department = department;
	}
      @Override
      public void displayDetails() {
    	  super.displayDetails();
    	  System.out.println("employeeId: "+empId+" , Department of employee: "+department);
      }
}
