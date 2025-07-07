import java.util.*;

public class Ass1_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the Number: ");
		int num=sc.nextInt();
		System.out.print("\nThe Number: "+num);
		
		String bin=Integer.toBinaryString(num);
		String oct=Integer.toOctalString(num);
		String hex=Integer.toHexString(num);
		
		System.out.print("\nBinary Number: "+bin);
		System.out.print("\nOctal Number: "+oct);
		System.out.print("\nHexadecimal Number: "+hex);
		
		sc.close();

	}
}
