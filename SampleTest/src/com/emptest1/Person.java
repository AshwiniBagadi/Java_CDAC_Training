package com.emptest1;

import java.util.Scanner;

public class Person {

	Scanner sc=new Scanner(System.in);
	
	String name;
	MyDate dateOfBirth=new MyDate();
	
	public Person() {
	}
	
	public Person(String name,MyDate dateOfBirth)
	{
		this.name=name;
		this.dateOfBirth=dateOfBirth;
	}
	
	//Setters and Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(MyDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void accept()
	{
		System.out.println("Name: ");
		this.name=sc.next();
		System.out.println("Date Of Birth: ");
		dateOfBirth.setDay(sc.nextInt());
		dateOfBirth.setMonth(sc.nextInt());
		dateOfBirth.setYear(sc.nextInt());
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Date of Birth: ");
		dateOfBirth.displayDate();
	}
	
	
}
