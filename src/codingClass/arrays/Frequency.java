package codingClass.arrays;

import java.util.Scanner;

public class Frequency {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		System.out.println(uniqueNums(arr));
		printRepeated(arr);
		
	}

	private static void printFriquencyAll(int[] arr) {

		int count = 1;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				count++;
			}
			else {
				System.out.println(arr[i] + " - " + count);
				count = 1;
			}
		}
		System.out.println(arr[arr.length-1] + " - " + count);
	}
	
	
	static int uniqueNums(int[] arr) {
		
		int count = 1, sum = 0; 
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				count++;
			}
			else {
				if(count==1) {
					sum++;
				}
				count = 1;
			}
		}
		if(count == 1) {
			sum++;
		}
		return sum;
	}
	
	
	static void printRepeated(int[] arr) {
		
		int count = 1;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				count++;
			}
			else {
				if(count > 1) {
					System.out.println(arr[i] + " - " + count);
				}
				count = 1;
			}
		}
		if(count > 1) {
			System.out.println(arr[arr.length-1]  + " - " + count);
		}
	}
	
	
}











