package codingClass.day5;

import java.util.Scanner;

public class PrimeOrNOt {
	
	public static String isPrime(int n) {
		for(int i=2; i<=n/2; i++) {
		if(n%i==0) {
				return " not a prime";
			}
			else 
				return "prime";
		}
		return null;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		System.out.println(isPrime(n));
		int count = 0;
		for(int i=1; i<=n; i++) {
			count=count+i;
		}
		
		System.out.println(count);
		
	}

}
