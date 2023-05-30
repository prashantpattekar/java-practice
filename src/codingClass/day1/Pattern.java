package codingClass.day1;

import java.util.Scanner;

public class Pattern {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n ");
		int n = scan.nextInt();
		
//		for(int i=0; i<n ; i++ ) {
//			for (int j=0; j<n; j++) {
//			System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<n ; i++ ) {
			for (int j=0; j<n; j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1
						|| j==n/2 || i==n/2
						|| i+j==n-1 || i==j) {
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
		
//		for(int i=0; i<n ; i++ ) {
//			for (int j=0; j<n; j++) {
//				if(i==0 || j==0 || i==n-1 || j==n-1
//						|| j==n/2 || i==n/2
//						|| i+j==n/2 ||j-i==n/2
//						|| i-j==n/2 || i+j==n+n/2-1 ) {
//					System.out.print("* ");
//				}else
//				System.out.print("  ");
//			}
//			System.out.println();
//		}

	}

}
