package codingClass.day5;

import java.util.Scanner;

public class NaturalSum {
	
	public static int sum(int n) {
		int count = 0;
		for(int i=0; i<=n; i++) {
			count=count +i;
		
		}
		return count;
	}
	
	public static int sum2(int n ) {
		return n*(n+1)/2;
		
	}
	
	public static void main(String[ ] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		System.out.println(sum2(n));
	}

}
