package codingClass.day4;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		
		// factors of number
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		//count factors
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
		if(count==2) {
			System.out.println("prime");
		}else
			System.out.println("not prime");


	}

}
