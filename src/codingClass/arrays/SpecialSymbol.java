package codingClass.arrays;

import java.util.Scanner;

public class SpecialSymbol {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		
		intsertSymbol(arr);
	}

	public static void intsertSymbol(int[] arr) {

		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] % 2 == 0 && arr[i+1] % 2 == 0) {
				System.out.print(arr[i] + "#");
			}
			else if(arr[i]%2!=0 && arr[i+1]%2!=0) {
				System.out.print(arr[i]+"*");
			}else {
				System.out.print(arr[i]+"$");
			}
		}
		System.out.println(arr[arr.length-1]);
	}
}
