package com.assign05;

//Write a java program to reverse a String

public class String2 {

	public static void main(String[] args) {
		int i,j;
		String s="ashwini";
		System.out.println(s);
		
		char[] ch=s.toCharArray();
		char[] ch2=new char[ch.length];
		
		for (i=0,j=ch2.length-1; i<ch.length; i++,j--)
		{
			ch2[j]=ch[i];
		}
		String s2=new String(ch2);
		System.out.println(s2);

	}

}
