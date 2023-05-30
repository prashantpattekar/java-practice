package codingClass.arrays;

import java.util.Scanner;

public class MaxPair {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		int res = minPair(arr);
		System.out.println(res);
		
	}

	private static int maxPair(int [] arr) {

		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]+arr[i+1] > max) {
				max = arr[i] + arr[i+1];
			}
		}
		return max;
	
	}
	
	
	private static int minPair(int [] arr) {

		int max = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]+arr[i+1] < max) {
				max = arr[i] + arr[i+1];
			}
		}
		return max;
	
	}

}
