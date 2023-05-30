package codingClass.day6;

import java.util.Scanner;

public class ArraysBasics {
	
	static Scanner scan = new Scanner(System.in);
	
	public static String isPrime(int n) {
		for(int i =0; i<=n/2; i++) {
			if(n%i == 0) {
				return "not a prime";
			}else
				return "prime";
		}
		return null;
	}
	
	public static void arrays(int n) {
		
		System.out.println("enter the elements of an array");
		int [] arr = new int[n];
		//input
		for(int i = 0;  i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		//output
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		// reverse output
		for(int i =arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void evenIndex(int[] arr,int n) {
		
		System.out.println("enter the elements of an array");
		//input
		for(int i = 0;  i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		//output
		for(int i=0; i<arr.length; i=i+2) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void oddIndex(int[] arr,int n ) {
		System.out.println("enter the  " + n +"  elements of an array");
		
		//input
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		// output
		for(int i=1; i<arr.length; i=i+2) {
			System.out.println(arr[i]+" ");
		}
		
	}
	
	public static void main (String [] args) {
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		int [] arr = new int[n];
		oddIndex(arr,n);
	}

}
