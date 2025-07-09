package com.app.fruits;

public class Mango extends Fruit{
	
	public Mango() {}
	
	public Mango(String name,String clr,double weight,boolean isFresh)
	{
		super(name,clr,weight,isFresh);
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void accept() {
		super.accept();
	}
	
	@Override
	public String taste() {
		return "Sweet";
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Taste: "+this.taste());
	}
}
