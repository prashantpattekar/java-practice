package codingClass.day6;

import java.util.Scanner;

public class LargestSmallest {
	
	static void evenOddNegetive(int [] arr) {
		for(int i =0; i<arr.length; i++) {
			if(arr[i]<0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==1 && arr[i] > 0) {
				System.out.print(arr[i] +" ");
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0 && arr[i] >= 0) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
		
	}

	
	static int largest(int[] arr ){
		int max =Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

	
	static int smallest(int[] arr ){
		int min =Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	
	
	public static void main (String [ ] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int res = largest(arr);
		System.out.println(res);
	}

}
