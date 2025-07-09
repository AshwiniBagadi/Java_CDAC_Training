package com.assign05;

public class String3_2 {
	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("lemon");
		System.out.println(sb1.toString());
		
		StringBuffer sb2=sb1.reverse();
		
		if((sb1.toString()).equals(sb2.toString()))
		{
			System.out.println("The given String is Palindrome!");
		}
		else
		{
			System.out.println("The given String is NOT Palindrome!");
		}
	}
}
