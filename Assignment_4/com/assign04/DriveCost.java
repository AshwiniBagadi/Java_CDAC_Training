package com.assign04;

import java.util.Scanner;

public class DriveCost {
	
	int miles;
	double gallon;
	double avggal;
	double parking;
	double toll;
	double total;
	
	public DriveCost() {}
	
	public DriveCost(int miles, double gallon, double avggal,double parking,double toll)
	{
		this.miles= miles;
		this.gallon= gallon;
		this.avggal= avggal;
		this.parking= parking;
		this.toll= toll;
	}
	
	public void accept(Scanner sc)
	{
		System.out.println("\nTotal miles driven per day: ");
		this.miles=sc.nextInt();
		System.out.println("Cost per gallon of gasoline: ");
		this.gallon=sc.nextDouble();
		System.out.println("Average miles per gallon: ");
		this.avggal=sc.nextDouble();
		System.out.println("Parking fees per day: ");
		this.parking=sc.nextDouble();
		System.out.println("Tolls per day: ");
		this.toll=sc.nextDouble();
	}
	
	public void display()
	{
		//The daily driving cost is calculated by adding 
		//the fuel cost (miles per day divided by miles per 
		//gallon times cost per gallon) to the sum of daily 
		//parking fees and tolls.
		total=(miles/avggal)*gallon+parking+toll;
		System.out.println("\nTotal Driving Cost per Day: "+total);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DriveCost d=new DriveCost();
		d.accept(sc);
		d.display();
	}

}
