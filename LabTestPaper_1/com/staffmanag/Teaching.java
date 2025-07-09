package com.staffmanag;

import java.util.Scanner;

public class Teaching extends Staff{
	int noOfHrs;
	double chargesPerHr;
	
	Scanner sc=new Scanner(System.in);
	
	public Teaching() {}

	public Teaching(int id, String name, int noOfHrs, double chargesPerHr) {
		super(id, name);
		this.noOfHrs=noOfHrs;
		this.chargesPerHr=chargesPerHr;
	}
	

	public int getNoOfHrs() {
		return noOfHrs;
	}

	public void setNoOfHrs(int noOfHrs) {
		this.noOfHrs = noOfHrs;
	}

	public double getChargesPerHr() {
		return chargesPerHr;
	}

	public void setChargesPerHr(double chargesPerHr) {
		this.chargesPerHr = chargesPerHr;
	}
	
	@Override
	public void accept() {
		super.accept();
			
		try {
				System.out.println("No of Hours- ");
				this.noOfHrs=sc.nextInt();
				if(noOfHrs<=0)
					throw new StaffException("Number of Hours should be more than 0!");
			
				System.out.println("charges per hour- ");
				this.chargesPerHr=sc.nextDouble();
				if(chargesPerHr<=0)
					throw new StaffException("Charges per Hour should be more than 0!");
		}
		catch(StaffException e)
		{
				e.printStackTrace();
		}
		
		
	}

	@Override
	public String toString() {
		return "Teaching Staff [ID= " + id + ", Name= " + name+", No Of Hrs= " + noOfHrs + ", charges per Hr= " + chargesPerHr
				+ "]";
	}

	
}
