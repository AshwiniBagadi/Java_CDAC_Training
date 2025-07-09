package com.ashwini;

import java.util.Scanner;

public class Date {
	int day;
	int mon;
	int year;
	
	Scanner sc=new Scanner(System.in);
	
	public Date()
	{
		day=00;
		mon=00;
		year=00;
	}
	
	public Date(int day,int mon, int year)
	{
		this.day=day;
		this.mon=mon;
		this.year=year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMon(int mon) {
		this.mon = mon;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMon() {
		return mon;
	}

	public int getYear() {
		return year;
	}
	
	public void acceptDate()
	{
		System.out.println("Enter Day: ");
		int day=sc.nextInt();
		System.out.println("Enter Month: ");
		int mon=sc.nextInt();
		System.out.println("Enter Year: ");
		int year=sc.nextInt();
		
		setDay(day);
		setMon(mon);
		setYear(year);
	}
	
	public void displayDate()
	{
		System.out.println("\nDate: "+day+"/"+mon+"/"+year);
	}
	
}
