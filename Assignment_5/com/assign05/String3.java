package com.assign05;

//Write a java code to check string is palindrome.

public class String3 {
	public static void main(String[] args) {
		
		int i,j;
		String s="lemon";
		System.out.println(s);
		
		char[] ch=s.toCharArray();
		char[] ch2=new char[ch.length];
		
		for (i=0,j=ch2.length-1; i<ch.length; i++,j--)
		{
			ch2[j]=ch[i];
		}
		String s2=new String(ch2);
		System.out.println(s2);
		boolean b=s.contentEquals(s2);
		
		if(b==true)
		{
			System.out.println("Palindrom");
		}
		else 
			System.out.println("Not Palindrom");
	}

}
