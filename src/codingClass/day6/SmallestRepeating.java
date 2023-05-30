package codingClass.day6;

import java.util.Scanner;

public class SmallestRepeating {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int res = findSmallestRepeating(arr);
		System.out.println(res);
	}

	public  static int findSmallestRepeating(int [] arr) {
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i] == arr[i-1]) {
				return arr[i];
			}
		}
		return -1;
	}

}
