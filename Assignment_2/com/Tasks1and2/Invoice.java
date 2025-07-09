package com.ashwini;

import java.util.Scanner;

public class Invoice {
	String num;
	String discr;
	int quan;
	double price;
	
	Scanner sc=new Scanner(System.in);
	
	public Invoice()
	{
		num="";
		discr="";
		quan=0;
		price=0.0;
	}
	
	public Invoice(String num, String discr, int quan, double price)
	{
		this.num=num;
		this.discr=discr;
		this.quan=quan;
		this.price=price;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setDiscr(String discr) {
		this.discr = discr;
	}

	public void setQuan(int quan) {
		this.quan = quan;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNum() {
		return num;
	}

	public String getDiscr() {
		return discr;
	}

	public int getQuan() {
		return quan;
	}

	public double getPrice() {
		return price;
	}
	
	public void acceptIn()
	{
		System.out.println("\nEnter Number: ");
		num=sc.next();
		System.out.println("Discription: ");
		discr=sc.next();
		System.out.println("Enter Quantity: ");
		quan=sc.nextInt();
		if(quan<0)
			quan=0;
		System.out.println("Enter Price: ");
		price=sc.nextDouble();
		if(price<0.0)
			price=0.0;
		
	}
	
	public void displayIn()
	{
		System.out.println("\nNumber: "+num+"\nDiscription: "+discr+"\nQuantity: "+quan+"\nPrice: "+price);
		System.out.println("\nInvoice Amount: "+quan*price);
	}
	
}
