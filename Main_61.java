package com.java.coding.practice61;

public class Main_61 {

	public static void main(String[] args) {
		
		Vehicle v=new Vehicle();
		v.move();
		Vehicle v2=new Car();
		v2.move();
		Car c=new Car();
		c.move();

		Person p=new Person("John", 27);
		p.displayDetails();
		
		Employees e=new Employees("Johny", 28, 12345, "R&D");
		e.displayDetails();
		Person e2=new Employees("Mohit", 25, 00112, "Sales");
		e2.displayDetails();
		
		Manager m=new Manager("Sumit", 35, 11223, "HR", 5);
		m.displayDetails();

     
		
		BankAccount ba=new BankAccount(1254800124, 15000.2);
		printAccountDetails(ba);
		
		SavingAccount sa=new SavingAccount(548721021, 16154.2, 6.5);
		printAccountDetails(sa);
		
		
	}
	public static void printAccountDetails(BankAccount account) {//BankAccount k jagah kuchh aur.
		System.out.println(account.toString());
	}

}
