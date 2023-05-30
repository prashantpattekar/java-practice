package codingClass.arrays;

import java.util.Scanner;

public class Rearrange {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
	   rearrangeZeros(arr);
	    
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
	// return new array
	private static int[] rearrange(int[] arr) {
		int res[] = new int[arr.length];
		int k=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == -1) {
				res[k++]=-1;
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=0) {
				res[k++]=arr[i];
			}
		}
		return res;
	}
	
	static void rearrangeNegetive(int[] arr) {
		int i=arr.length-1;
		int j=arr.length-1;
		
		while(i>=0) {
			if(arr[i] == -1) {
				i--;
			}else {
				arr[j--]=arr[i--];
			}
		}
		while(j>=0) {
			arr[j--]=-1;
		}
	}
	
	
	
	// move zeros to the last positions
	static void rearrangeZeros(int[] arr) {
		int i=0, j=0;
		
		while(i<arr.length) {
			if(arr[i]==0) {
				i++;
			}else {
				arr[j++] = arr[i++];
			}
		}
		while(j<arr.length) {
			arr[j++] = 0;
		}
	}		
}
