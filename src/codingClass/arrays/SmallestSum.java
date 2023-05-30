package codingClass.arrays;

import java.util.Scanner;

public class SmallestSum {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		int res = largestSum(arr);
		System.out.println(res);
	}

	private static int smallestSum(int[] arr) {

		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min1) {
				min2 = min1;
				min1 = arr[i];
			}
			else if(arr[i] < min2) {
				min2 = arr[i];
			}
		}
		return min1 + min2;
	
	}
	
	static int largestSum(int[] arr) {
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i] > max2) {
				max2 = arr[i];
			}
		}
		return max1+max2;
	}
}
