package com.assign04.tester;

import java.util.Scanner;

import com.assign04.point.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		int i1,i2;
		int choice;
		System.out.println("Number points to plot: ");
		no=sc.nextInt();
		Point2D[] pnt=new Point2D[no];
		for(int i=0;i<no;i++)
		{
			pnt[i]=new Point2D();
			pnt[i].accept();
		}
		
		while(true)
		{
			System.out.println("\nMENU\n1. Display details of spacific point "
				+ "\n2.Display x and y co-ordinates of all points"
				+ "\n3.Validate the indices \n4.Exit");
			choice=sc.nextInt();
			System.out.println("-------------------------");
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Index: ");
				int index=sc.nextInt();
				if(pnt[index]!=null)
					System.out.println(pnt[index].getDetails());
				else
					System.out.println("Invalid Index, Please retry!");
				break;
				
			case 2:
				for(int i=0;i<no;i++)
				{
					System.out.println(pnt[i].getDetails());
				}
				break;
				
			case 3:
				System.out.println("Enter two indices: ");
				i1=sc.nextInt();
				i2=sc.nextInt();
				if(i1>=0 && i1<no && i2>=0 && i2<no)
				{
					if(pnt[i1].equals(pnt[i2]))
					{
						System.out.println("Both points are located at the same position.");
					}
					else
					{
						System.out.println("Distance between Two Points: "+pnt[i1].calculateDistance(pnt[i2]));
					}
				}
				
				break;
				
			case 4:
				sc.close();
				return;
			}
		}
	}

}
