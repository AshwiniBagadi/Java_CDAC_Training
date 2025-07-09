package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	String name;
	String clr;
	double weight;
	boolean isFresh=true;
	
	Scanner sc =new Scanner(System.in);
	
	public Fruit() {}
	
	public Fruit(String name,String clr,double weight,boolean isFresh)
	{
		this.name=name;
		this.clr=clr;
		this.weight=weight;
		this.isFresh=isFresh;
	}
	
	
	public String getName() {
		return name;
	}

	public void accept()
	{
		System.out.println("Name: ");
		name=sc.nextLine();
		System.out.println("Colour: ");
		clr=sc.nextLine();
		System.out.println("Weight: ");
		weight=sc.nextDouble();
		System.out.println("is Fresh: "+isFresh);
	}
	
	public String taste()
	{
		return "No specific Taste!";
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Colour: "+clr);
		System.out.println("Weight: "+weight);
		System.out.println("is Fresh: "+isFresh);
	}
}
