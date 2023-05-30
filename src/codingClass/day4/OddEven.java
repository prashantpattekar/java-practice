package codingClass.day4;

import java.util.Scanner;
public class OddEven {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value");
		int n = scan.nextInt();
		
		
//		// n even  numbers
//		for (int i=2; i<=2*n; i++) {
//			if(i%2==0)
//			{
//		         System.out.print(i+" ");
//		    }
//		}
		
//		for (int i=2; i<=2*n; i=i+2) {
//			  System.out.print(i+" ");
//		}
		
		
//		// n odd numbers
//		for (int i=1; i<=2*n; i++) {
//			if(i%2==0)
//			{
//		         System.out.print(i-1+" ");
//		    }
//		}
		
		for (int i=1; i<=2*n; i=i+2) {
		         System.out.print(i+" ");
		}
	
	
	}

}
