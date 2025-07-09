package com.ashwini;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice I1=new Invoice();
		Invoice I2=new Invoice("102","Hardware 2",3,1500);
		
		I1.acceptIn();
		
		I1.displayIn();
		I2.displayIn();

	}

}
