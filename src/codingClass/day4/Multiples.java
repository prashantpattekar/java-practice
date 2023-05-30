package codingClass.day4;

import java.util.Scanner;
public class Multiples {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		
		
		System.out.println("\nN multiples of 3");
		
		// N multiples of 3
		for(int i=1; i<=3*n; i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		
		// for new line
		System.out.println("\nN multiples of 5");
		
		// N multiples of 5
		for(int i=5; i<=5*n; i=i+5) {
			System.out.print(i+ " ");
		}
		
		// for new line
				System.out.println("\nmultiples of 2 and 3 till n");
		
		// multiples of 2 and 3 till n
		for(int i=1; i<=n; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
			}
		}
	

		// for new line
				System.out.println("\nmultiples of 2 and 5 and 7 till n");
		
		
		// multiples of 2 and 5 and 7 till n
		for(int i=1; i<=n; i++) {
			if(i%2==0 || i%5==0 || i%7==0) {
				System.out.print(i+" ");
					}
				}
				
		// for new line
				System.out.println("\nmultiples of 5 and 3 and 7 till n");
		
		// multiples of 5 and 3 and 7 till n
		for(int i=1; i<=n; i++) {
			if(i%5==0 || i%3==0 || i%7==0) {
				System.out.print(i+" ");
			}
		}		
				
	}

}
