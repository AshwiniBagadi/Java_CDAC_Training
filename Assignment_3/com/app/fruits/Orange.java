package com.app.fruits;

public class Orange extends Fruit{
	public Orange() {}
	
	public Orange(String name,String clr,double weight,boolean isFresh)
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
		return "Sour";
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Taste: "+this.taste());
	}
}
