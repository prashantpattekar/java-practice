package codingClass.day2;

import java.util.Scanner;

public class Name {
	
	public static void name(int n ) {
		
	for(int i=0; i<=n; i++) {
		
		// P
		for (int j=0; j<=n/2; j++) {
			if(j==0
				|| i==0 && j<n/2
				|| i==n/2 && j<n/2
				|| j==n/2 &&i<n/2 && i!=0) {
				
				System.out.print("p ");
			}else
			System.out.print("  ");
		}
		   System.out.print("  ");
		
		
		   // R
		for (int j=0; j<=n/2; j++) {
			if(j==0 || i==0 && j<n/2 
					|| i==n/2 && j<n/2
					|| j==n/2 && i<n/2 && i!=0 
					|| i-j==n/2 && j<=n/2) {
				
				System.out.print("r ");
			}else
			System.out.print("  ");
		}
		   System.out.print("  ");
		
		
		// A
		for (int j=0; j<=n/2; j++) {
			if(j==0 || j==n/2 
					|| i==0 && j<=n/2
					|| i==n/2 && j<=n/2) {
				System.out.print("a ");
			}else
			System.out.print("  ");
		}
		
		  System.out.print("  ");
		
		// S
		  for (int j=0; j<=n/2; j++) {
				if(i==0 && j<n/2 && j!=0 
				   || i==n/2 && j<n/2 && j!=0 
				   || i==n && j<n/2 
				   || j==0 && i<n/2 && i!=0
				   || j==n/2 && i>n/2 && i!=n) {
					
					System.out.print("s ");
				}else
				System.out.print("  ");
			}
		  System.out.print("  ");
		  
		  
		  // H
		  for (int j=0; j<=n/2; j++) {
				if(j==0
					|| j==n/2 ||
					i==n/2 && j<=n/2) {
					
					System.out.print("h ");
				}else
				System.out.print("  ");
		  }
		  System.out.print("  ");
		  
		  
		  for (int j=0; j<=n/2; j++) {
				if(j==0 || j==n/2 
						|| i==0 && j<=n/2
						|| i==n/2 && j<=n/2) {
					System.out.print("a ");
				}else
				System.out.print("  ");
			}
			
			  System.out.print("  ");
			  
			  
			  for (int j=0; j<=n; j++) {
					if(j==0  ||
					    j==n || i==j) {
						
						System.out.print("n ");
					}else
					System.out.print("  ");
				}
			  
			  System.out.print("  ");
			  
			  
			  for (int j=0; j<n; j++) {
					if(i==0 || j==n/2) {
						
						System.out.print("t ");
					}else
					System.out.print("  ");
				}
			  
		
		System.out.println();
	}
	
	
	
	
	}

	
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		name(n);
	}
}
