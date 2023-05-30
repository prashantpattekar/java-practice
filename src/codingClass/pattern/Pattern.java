package codingClass.pattern;

import java.util.Scanner;

public class Pattern {
	
	
	public static void pattern1(int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
     public static void pattern2(int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(j+1+ " ");
			}
			System.out.println();
		}
	}
     
     public static void pattern3(int n) {
 		
 		for(int i=0; i<n; i++) {
 			for(int j=0; j<n; j++) {
 				if(i==0 || i==n-1 || j==0 || j==n-1) {
 					System.out.print("* ");
 					}
 				else {
 					System.out.print("  ");
 				}
 			}
 			System.out.println();
 		}
 	}
	
     
     public static void pattern4(int n) {
  		int count = 0; 
  		for(int i=0; i<n; i++) {
  			for(int j=0; j<n; j++) {
  				count++;
  				if(count <= 9) {
  					System.out.print("0");
  					}
  				System.out.print(count +" ");
  			}
  			System.out.println();
  		}
  	}
     
     public static void pattern5(int n) {
   		for(int i=1; i<=n; i++) {
   			for(int j=1; j<=n; j++) {
   				
   				if( i*j <= 9) {
   					System.out.print("0");
   					}
   				System.out.print(i*j +" ");
   			}
   			System.out.println();
   		}
   	}
     
     public static void pattern6(int n) {
   		
   		for(int i=0; i<n; i++) {
   			int count = i;
   			for(int j=0; j<n; j++) {
   				count++;
   				System.out.print(count +" ");
   			}
   			System.out.println();
   		}
   	} 
     
     public static void pattern7(int n) {
    		
   		for(int i=0; i<n; i++) {
   			for(int j=0; j<=i; j++) {
   				System.out.print(i+1 +" ");
   			}
   			System.out.println();
   		}
   	}
     
     public static void pattern8(int n) {
 		
   		for(int i=0; i<n; i++) {
   			for(int k=0; k<n-1-i; k++) {
   				System.out.print(" ");
   			}
   			for(int j=0; j<=i; j++) {
   				System.out.print("*");
   			}
   			System.out.println();
   		}
   	}
     
     public static void pattern9(int n) {
  		
   		for(int i=0; i<n; i++) {
   			for(int k=0; k<n-1-i; k++) {
   				System.out.print(" ");
   			}
   			for(int j=0; j<=i; j++) {
   				System.out.print("* ");
   			}
   			System.out.println();
   		}
   	}
     
     
     public static void pattern10(int n) {
   		
    		for(int i=0; i<n; i++) {
    			for(int k=0; k<n-1-i; k++) {
    				System.out.print(" ");
    			}
    			for(int j=0; j<=i; j++) {
    				if(j==0 || j==i || i==n-1) {
    					System.out.print(j+1+" ");
    				}
    				else {
    					System.out.print("  ");
    				}
    				
    			}
    			System.out.println();
    		}
    	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("enter the value of n");
//		int n = scan.nextInt();
//		pattern10(n);
		
		System.out.println(4 << 3);
		
    }

}
