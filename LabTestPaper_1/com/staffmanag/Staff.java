package com.staffmanag;

import java.util.Scanner;

class StaffException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	StaffException() {}
	
	StaffException(String message)
	{
		super(message);
	}
	
}

public class Staff {
	
	int id;
	String name;
	Scanner sc=new Scanner(System.in);
	
	public Staff() {}

	public Staff(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void accept()
	{
		System.out.println("ID- ");
		this.id=sc.nextInt();
		System.out.println("name- ");
		this.name=sc.next();
	}

	@Override
	public String toString() {
		return "Staff [ID= " + id + ", Name= " + name + "]";
	}
	
	
}
