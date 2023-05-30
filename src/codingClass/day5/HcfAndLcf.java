package codingClass.day5;

import java.util.Scanner;

public class HcfAndLcf {
	 
	//prints common factors of two numbers
	public static void commonFactor(int n, int m) {
		
		for(int i=1; i<=n; i++) {
			if(n%i==0 && m%i==0) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	//prints lowest common factor of two numbers
      public static void highestcommonFactor(int n, int m) {
    	  
		
		    for(int i=n; i>0; i--) {
			       if(n%i==0 && m%i==0) {
				      System.out.print(i+" ");
				      break;
			     }
		    }
		
	}
      
      // prints lowest common factors of two numbers excluding 1 and 2
      public static void lcFactor(int n, int m) {
    	  
    	  for(int i=3; i<=n; i++) {
		       if(n%i==0 && m%i==0) {
			      System.out.print(i+" ");
			      break;
		     }
	    }
    	  
      }

      //driver method
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the two numbers");
		int n = scan.nextInt();
		int m = scan.nextInt();
		scan.close();
		
		lcFactor(n,m);
	}

}
