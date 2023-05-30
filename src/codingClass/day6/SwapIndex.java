package codingClass.day6;

import java.util.Scanner;

public class SwapIndex {
	
	
	
	static int[] index(int[] arr) {
		
		// prints before swapping
		System.out.println("before swaping");
		for(int i =0; i<arr.length; i++) {
			if(i%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		for(int i =0; i<arr.length; i++) {
			if( i%2==1) {
				System.out.print(arr[i]+" ");
			}
		}
		
		// swap 
		for(int i=0,j=1; j<arr.length; i=i+2,j=j+2) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		System.out.println();
		// prints after  swapping
		System.out.println("after swaping");
		for(int i =0; i<arr.length; i++) {
			if(i%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		for(int i =0; i<arr.length; i++) {
			if( i%2==1) {
				System.out.print(arr[i]+" ");
			}
		}
		
		return arr;
				
	
	}
	
	public static void main(String[ ] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		scan.close();  
		
		index(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		
		
	}

}
