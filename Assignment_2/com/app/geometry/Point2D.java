package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	int x;
	int y;
	
	Scanner sc = new Scanner(System.in);
	
	public Point2D() {
		this(0, 0);
	}
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public void accept() {
		
		System.out.println("Enter X co-ordinate: ");
		x = sc.nextInt();
		System.out.println("Enter Y co-ordinate: ");
		y = sc.nextInt();
		
	}
	
	public boolean isEqual(Point2D p) {
		if(this.x == p.x && this.y == p.y)
			return true;
		return false;
	}
	
	public double calculateDistance(Point2D p) {
		return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
	}
	
	public String getDetails() {
		return "("+x+", "+y+")";
	}
}
