package codingClass.day6;

import java.util.Scanner;

public class EvenOdd {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void even(int[] arr,int n) {
		//input
		System.out.println("enter the "+ n+ " elements of an array");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();	
		}
		
		// output
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+"  ");
			}
		}
	}
	
	public static void odd(int[] arr,int n) {
		//input
		System.out.println("enter the "+ n+ " elements of an array");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();	
		}
		
		// output
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==1) {
				System.out.print(arr[i]+"  ");
			}
		}
	}
	
	public static void evenreverse(int[] arr,int n) {
		//input
		System.out.println("enter the "+ n+ " elements of an array");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();	
		}
		
		// output
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+"  ");
			}
		}
	}
	
	public static void oddreverse(int[] arr,int n) {
		//input
		System.out.println("enter the "+ n+ " elements of an array");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();	
		}
		
		// output
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i]%2==1) {
				System.out.print(arr[i]+"  ");
			}
		}
	}
	
	public static void main(String [] args) {
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		int [] arr = new int[n];
		oddreverse(arr,n);
	}

}
