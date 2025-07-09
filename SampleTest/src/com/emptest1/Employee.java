package com.emptest1;

import java.util.Scanner;

public class Employee extends Person{
	Scanner sc=new Scanner(System.in);
	
	int id;
	String department;
	double salary;
	MyDate doj=new MyDate();
	
	public Employee() {
		
	}
	
	public Employee(String name,MyDate dateOfBirth,int id,String department,double salary,MyDate doj)
	{
		super(name,dateOfBirth);
		this.id=id;
		this.department=department;
		this.salary=salary;
		this.doj=doj;
	}
	
	//Setters and Getters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDoj() {
		return doj;
	}

	public void setDoj(MyDate doj) {
		this.doj = doj;
	}

	@Override
	public void accept() {
		super.accept();
		System.out.println("Employee ID: ");
		this.id=sc.nextInt();
		System.out.println("Department: ");
		this.department=sc.next();
		System.out.println("Salary: ");
		this.salary=sc.nextDouble();
		System.out.println("Date Of Joining: ");
		doj.setDay(sc.nextInt());
		doj.setMonth(sc.nextInt());
		doj.setYear(sc.nextInt());
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Employee ID: "+id);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+salary);
		System.out.println("Date Of Joining: ");
		doj.displayDate();
	}
}
