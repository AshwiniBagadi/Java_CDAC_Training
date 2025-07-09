package com.ashwini;

public class DateTest {

	public static void main(String[] args) {
		Date d1=new Date();
		Date d2=new Date(03,05,2025);
		
		d1.acceptDate();
		
		d1.displayDate();
		d2.displayDate();

		System.out.println("\nYear for d1: "+d1.getYear());
		
		System.out.println("Year for d2: "+d2.getYear());
	}

}
