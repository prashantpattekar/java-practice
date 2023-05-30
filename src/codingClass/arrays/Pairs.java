package codingClass.arrays;

import java.util.Scanner;

public class Pairs {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int k = scan.nextInt();
		scan.close();
		
		printPair(arr, k);
	}

	public static void printPairs(int[] arr) {

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				System.out.println(arr[i] + " - " + arr[j]);
			}
			
		}
	}
	
	
	
	public static void printPairsSum(int[] arr, int k) {

		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j] == k) {
					System.out.println(arr[i] + " - " + arr[j]);
				}
			}
			
		}
	}
	
	
	
	public static void printPair(int[] arr, int k) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] - arr[j] == k || arr[j]-arr[i] == k) {
					System.out.println(arr[i] + " - " + arr[j]);
				}
			}
			
		}
	}

}
