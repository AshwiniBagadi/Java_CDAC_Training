package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Fruit[] fr;
		int size;
		int no=0;
		int choice,i,index;
		
		System.out.println("Enter Size of array: ");
		size=sc.nextInt();
		fr=new Fruit[size];
		
		while(true)
		{
			System.out.println("\nMENU\n0. Exit \n1. Add Mango \n2. Add Orange \n3. Add Apple"
					+ "\n4. Display Names of Fruits \n5. Display All Information \n6. Mark as Stale "
					+ "\n7. Tastes of all Stale Fruits");
			System.out.println("Enter choice: ");
			choice=sc.nextInt();
			System.out.println("--------------------\n");
			switch(choice)
			{
			case 1:
				if(fr[no]==null && no<size)
				{
					fr[no]=new Mango();
					fr[no].accept();
					no++;
				}
				else
				{
					System.out.println("Basket Full!");
				}
				break;
				
			case 2:
				if(fr[no]==null && no<size)
				{
					fr[no]=new Orange();
					fr[no].accept();
					no++;
				}
				else
				{
					System.out.println("Basket Full!");
				}
				break;
				
			case 3:
				if(fr[no]==null && no<size)
				{
					fr[no]=new Apple();
					fr[no].accept();
					no++;
				}
				else
				{
					System.out.println("Basket Full!");
				}
				break;
				
			case 4:
				System.out.println("Names Of Fruits in Basket:\n");
				for(i=0;i<no;i++)
				{
					if(fr[i]!=null)
					{
						
						System.out.println(fr[i].getName());
						System.out.println("");
					}
				}
				break;
				
			case 5:
				for(i=0;i<no;i++)
				{
					if(fr[i]!=null)
					{
						fr[i].display();
						System.out.println("");
					}
				}
				break;
				
			case 6:
				System.out.print("Fruit Index to Mark as Stale: ");
				index=sc.nextInt();
				if(fr[index]!=null && index<size)
					fr[index].isFresh=false;
				else
					System.out.println("No such index Exists!");
				break;
				
			case 7:
				System.out.println("Stale Fruits' tastes: \n");
				for(i=0;i<no;i++)
				{
					if(fr[i].isFresh==false)
					{
						System.out.println("Name: "+fr[i].name+"\nTaste: "+fr[i].taste());
					}
				}
				break;
				
			case 0:
				sc.close();
				return;
				
			}
		}

	}

}
