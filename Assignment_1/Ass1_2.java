
import java.util.Scanner;

public class Ass1_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num1,num2;
		
		System.out.print("\nNumbers: \n");
		
		if(sc.hasNextDouble()==true && !sc.hasNextInt()==true)
		{
			num1=sc.nextDouble();
			
			if(sc.hasNextDouble()==true && !sc.hasNextInt()==true)
			{
				num2=sc.nextDouble();
				double sum=num1+num2;
				double avg=sum/2;
				System.out.println("Sum: "+sum);
				System.out.println("Average: "+avg);
				
			}
			
		}else 
		{
			System.out.println("Invalid Input");
			sc.close();
			return;
		}
		
		sc.close();
		
	}

}
