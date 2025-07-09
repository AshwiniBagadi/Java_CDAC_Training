package com.emptest1;

import java.util.Scanner;

public class MyDate {
	
	Scanner sc=new Scanner(System.in);
	
	int day;
	int month;
	int year;
	
	public MyDate() {}
	
	public MyDate(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}

	//setters and Getters
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void acceptDate()
	{
		System.out.println("Day: ");
		this.day=sc.nextInt();
		System.out.println("Month: ");
		this.month=sc.nextInt();
		System.out.println("Year: ");
		this.year=sc.nextInt();
	}
	
	public void displayDate()
	{
		System.out.println("Date: "+this.getDay()+"/"+this.getMonth()+"/"+this.getYear());
	}
}
