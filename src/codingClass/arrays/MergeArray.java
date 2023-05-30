package codingClass.arrays;

import java.util.Scanner;

public class MergeArray {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		
		int [] arr1 = new int[n];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		
		int m = scan.nextInt();
		int[] arr2 = new int[m];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = scan.nextInt();
		}
		
		int[] res = mergeSortedArrays(arr1,arr2);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}
		
		
	}

	private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		int res[] = new int[arr1.length+arr2.length];
		
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr2[j] < arr1[i]) {
				res[k++]=arr2[j++];
			}
			else {
				res[k++] = arr1[i++];
			}
		}
		
		
		while(j<arr2.length) {
			res[k++] = arr2[j++];
		}
		
		
		
		while(i<arr1.length) {
			res[k++] = arr1[i++];
		}	
		return res;
		
	}
}
