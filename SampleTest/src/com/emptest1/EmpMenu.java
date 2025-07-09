package com.emptest1;

import java.util.Scanner;

public class EmpMenu {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Employee[] p=new Employee[10];
		int count=0;
		int choice,i,sid,jy,maxno=0,minno=0;
		double max,min;
		
		while(true)
		{
			System.out.println("\nMENU\n1. Add Employee "
					+ "\n2. Display All Employees "
					+ "\n3. Search Employee "
					+ "\n4. Employees joined in Year "
					+ "\n5. Employee with Maximum Salary "
					+ "\n6. Employee with Minimum Salary"
					+ "\n7. Exit");
			System.out.print("Enter your Choice: ");
			choice=sc.nextInt();
			System.out.print("------------------------\n");
			switch(choice)
			{
			case 1:
				if(p[count]==null && count<10)
				{
					p[count]=new Employee();
					p[count].accept();
					count++;
				}
				else
				{
					System.out.println("Limit Reached!");
				}
				break;
				
			case 2:
				for(i=0;i<count;i++)
				{
					if(p[i]!=null)
					{
						p[i].display();
						System.out.println("");
					}
				}
				break;
				
			case 3:
				System.out.println("Enter search ID: ");
				sid=sc.nextInt();
				for(i=0;i<count;i++)
				{
					if(p[i].id==sid)
					{
						p[i].display();
						System.out.println("");
					}
				}
				break;
				
			case 4:
				System.out.print("Employee Joining Year: ");
				jy=sc.nextInt();
				for(i=0;i<count;i++)
				{
					if(p[i].doj.year==jy)
					{
						p[i].display();
						System.out.println("");
					}
				}
				break;
				
			case 5:
				max=p[0].salary;
				for(i=0;i<count;i++)
				{
					if(p[i].salary>max)
					{
						max=p[i].salary;
						maxno=i;
					}
				}
				System.out.println("Employee with Maximun Salary: ");
				System.out.println("ID: "+p[maxno].id+"\nName: "+p[maxno].name+
						"\nSalary: "+p[maxno].salary);
				break;
				
			case 6:
				min=p[0].salary;
				for(i=0;i<count;i++)
				{
					if(p[i].salary<min)
					{
						min=p[i].salary;
						minno=i;
					}
				}
				System.out.println("Employee with Maximun Salary: ");
				System.out.println("ID: "+p[minno].id+"\nName: "+p[minno].name+
						"\nSalary: "+p[minno].salary);
				break;
				
			case 7:
				sc.close();
				return;
			}
		}

	}

}
