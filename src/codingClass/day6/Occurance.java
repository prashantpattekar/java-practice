package codingClass.day6;

import java.util.Scanner;

public class Occurance {
	
	
	static int largestOccurance(int [] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > max ) {
				max = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==max) {
				return i;
			}
		}
		return -1;
	}
	
	static int smallestOccurance(int [] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]< min ) {
				min = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==min) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n ");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int res = smallestOccurance(arr);
		System.out.println(res);
	}

}
