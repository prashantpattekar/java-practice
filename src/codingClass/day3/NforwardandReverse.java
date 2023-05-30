package codingClass.day3;

import java.util.Scanner;

public class NforwardandReverse {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		
		// forward
//		for(int i =1; i<=n; i++ ) {
//			System.out.print(i + "  ");
//		}
		
		
		// reverse
		for(int i=n; i>0; i--) {
			System.out.print(i + "  ");
		}

	}

}
