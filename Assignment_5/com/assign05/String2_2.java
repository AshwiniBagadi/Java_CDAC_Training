package com.assign05;

public class String2_2 {
	
	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("Ashwini");
		
		System.out.println("Original String- ");
		System.out.println(sb1.toString());
		
		StringBuffer sb2=sb1.reverse();
		
		System.out.println("Reversed String- ");
		System.out.println(sb2.toString());
		
	}
}
