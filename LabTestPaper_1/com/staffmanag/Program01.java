package com.staffmanag;

import java.util.Scanner;

public class Program01 {
	
	static Scanner sc=new Scanner(System.in);
	
	public static int Menu()
	{
		System.out.println("-----------------------\n"
				+ "MENU \n0. Exit \n"
				+ "1. Add Teaching Staff \n"
				+ "2. Add Lab staff.\n"
				+ "3. Display all Teaching staff \n"
				+ "4. Display All Lab staff \n"
				+ "5. Find specific teaching staff \n"
				+ "6. Find specific lab staff \n"
				+ "7. Display teaching staff who worked for highest hours \n"
				+ "8. Display lab staff who have lowest salary \n"
				+ "\nEnter your Choice- ");
		int choice=sc.nextInt();
		System.out.println("------------------------");
		return choice;
	}
	

	public static void main(String[] args) {
		Staff[] s=new Staff[10];
		int index=0;
		int choice;
		int high=0,hid=0,lid=0;
		double low=0;
		
		while(true)
		{
			choice=Menu();
			switch(choice)
			{
			case 1:
				if(s[index]==null && index<10)
				{
					s[index]=new Teaching();
					s[index].accept();
					index++;
				}
				else
				{
					System.out.println("Limit is Reached!");
				}
				break;
				
			case 2:
				if(s[index]==null && index<10)
				{
					s[index]=new Lab();
					s[index].accept();
					index++;
				}
				else
				{
					System.out.println("Limit is Reached!");
				}
				break;
				
			case 3:
				for(int i=0;i<index;i++)
				{
					if(s[i]!=null && s[i] instanceof Teaching)
					{
						System.out.println("Staff no- "+i);
						System.out.println(s[i].toString());
					}
				}
				break;
				
			case 4:
				for(int i=0;i<index;i++)
				{
					if(s[i]!=null && s[i] instanceof Lab)
					{
						System.out.println("Staff no- "+i);
						System.out.println(s[i].toString());
					}
				}
				break;
				
			case 5:
				int fg=0;
				System.out.println("Search for Teaching Staff with ID:");
				int s1=sc.nextInt();
				for(int i=0;i<index;i++)
				{
					if(s[i].id==s1 && s[i] instanceof Teaching)
					{
						System.out.println(s[i].toString());
						fg=1;
					}
				}
				if(fg==0)
					System.out.println("No such Staff record!");
				break;
				
			case 6:
				int flg=0;
				System.out.println("Search for Lab Staff with ID:");
				int s2=sc.nextInt();
				for(int i=0;i<index;i++)
				{
					if(s[i].id==s2 && s[i] instanceof Lab)
					{
						System.out.println(s[i].toString());
						flg=1;
					}
				}
				if(flg==0)
					System.out.println("No such Staff record!");
				break;
				
			case 7:
				Teaching t1=new Teaching();
				for(int i=0;i<index;i++)
				{
					if(s[i] instanceof Teaching)
					{
						t1=(Teaching) s[i];
						if(high<t1.noOfHrs)
						{
							high=t1.noOfHrs;
							hid=i;
						}
					}
				}
				System.out.println(s[hid]);
				hid=0; high=0;
				break;
				
			case 8:
				Lab l1=new Lab();
				for(int j=0;j<index;j++)
				{
					if(s[j] instanceof Lab)
					{
						l1=(Lab) s[j];
						if(low==0)
							low=l1.salary;
						
						if(low>l1.salary)
						{
							low= l1.salary;
							lid=j;
						}
					}
				}
				System.out.println(s[lid]);
				lid=0; low=0;
				break;
				
			case 0:
				return;
			}
		}

	}

}
