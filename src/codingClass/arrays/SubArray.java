package codingClass.arrays;

import java.util.Scanner;

public class SubArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
//		int k = scan.nextInt();
		
//		System.out.println(printSubArrayCount(arr,size,k));/
		printSubArraysAll(arr);
		
	}
	
	
	private static int printSubArrayCount(int[] arr, int size, int k) {	
		int count = 0;
		for(int i=0; i <= arr.length-size; i++) {
			int sum = 0;
			for(int j=i; j<size+i; j++) {
				sum = sum+arr[j];
			}
			if(sum == k) {
				count++;
			}
			
		}
		return count;
	}

	private static void printSubArraySum(int[] arr, int size, int k) {	
		for(int i=0; i <= arr.length-size; i++) {
			int sum = 0;
			for(int j=i; j<size+i; j++) {
				sum = sum+arr[j];
			}
			if(sum == k) {
				for(int j=i; j<size+i; j++) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
			
		}
	}

	private static void printSubArrays(int[] arr, int size) {
		for(int i=0; i <= arr.length-size; i++) {
			for(int j=i; j<size+i; j++) {
				System.out.print(arr[j] +"  ");
			}
			System.out.println();
		}
	}
	
	private static void printSubArraysAll(int[] arr) {
		for (int k=1; k < arr.length; k++) {
			for(int i=0; i <= arr.length-k; i++) {
				for(int j=i; j<k+i; j++) {
					System.out.print(arr[j] +"  ");
				}
				System.out.println();
			}
			
		}
	}

}
