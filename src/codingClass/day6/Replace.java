package codingClass.day6;

import java.util.Scanner;
public class Replace {
	
	static void replaceEven(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 ==0) {
				arr[i]=0;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n ");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		replaceEven(arr);
		
	}

}
