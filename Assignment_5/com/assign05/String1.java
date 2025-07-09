package com.assign05;

//Declare two Arrays of type String. Find the duplicate values of an array of string values. 
//(Hint:use equals())

public class String1 {
	
	public static void main(String[] args) {
		String[] a1=new String[5];
		String[] a2=new String[5];
		
		a1[0]="Ashwini";
		a1[1]="Tejasvi";
		a1[2]="Manali";
		a1[3]="Bhargavi";
		a1[4]="Neha";
		
		a2[0]="Tejasvi";
		a2[1]="Neha";
		a2[2]="Arya";
		a2[3]="Akshada";
		a2[4]="Bhargavi";
		
		for(int i=0; i<a1.length; i++)
		{
			for(int j=0; j<a2.length; j++)
			{
				if(a1[i].equals(a2[j]))
				{
					System.out.println("Same Names- "+a1[i]+" -at a1["+i+"] and a2["+j+"]");
				}
			}
		}
	}
}
