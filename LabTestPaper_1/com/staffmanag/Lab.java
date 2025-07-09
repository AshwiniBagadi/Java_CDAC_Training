package com.staffmanag;

import java.util.Scanner;

public class Lab extends Staff{
	double salary;
	
	Scanner sc=new Scanner(System.in);
	
	public Lab() {}

	public Lab(int id, String name, double salary) {
		super(id, name);
		this.salary=salary;
	}

	//Setters and Getters
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void accept() {
		super.accept();
		try {
			System.out.println("Salary- ");
			this.salary=sc.nextDouble();
			if(salary<=0)
				throw new StaffException("Salary should be more than 0!");
		}
		catch(StaffException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		
		return "Lab Staff [ID= " + id + ", Name= " + name +", Salary= "+salary+ "]";
	}
	
}
