package codingClass.day6;

import java.util.Scanner;

public class Sum {
	
	// sum of elements in array
	static int sum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
	
	//sum of even numbers in array
	static int sumEven(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0) {
				sum = sum+arr[i];
			}
			
		}
		return sum;
	}
	
	// returns sum of odd numbers in array
	static int sumOdd(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 1) {
				sum = sum+arr[i];
			}
		}
		return sum;
	}
	
	// prints elements divisible by 2 and 3
	static void elementsDivisible(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0 || arr[i]%3==0) {
				System.out.print(arr[i]+" ");
			}
		}
			
     }
	
	//returns the value divisible by 3 and 5
	static int sumElementsDivisible(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%3 == 0 || arr[i]%5==0) {
				sum = sum+arr[i];
			}
		}
		return sum;
	 }
	
	// prints the sum  of the negetive and positive elements of arrays
	static void sumPositiveNegetive(int[] arr) {
		int psum = 0;
		int nsum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0) {
				nsum = nsum+arr[i];
			}
			else
				psum =psum+arr[i];
		}
		System.out.println("positive sum =" + psum);
		System.out.println("positive sum =" + nsum);
	 }
   
	
	
	//return the average of the elements in arrays
	static float average(int[] arr,int n) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		float average = (float)sum/n;
		return average;
	 }
	
		
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		System.out.println("enter the elements of an array");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		float res = average(arr,n);
		System.out.println(res);
	}
}
