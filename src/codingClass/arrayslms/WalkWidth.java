package codingClass.arrayslms;

import java.util.Scanner;

public class WalkWidth {
	
	static int waldWidth(int[] a, int k) {
		
	    int width = 0;
	    for(int i = 0; i<a.length; i++) {
		    if(a[i] <= k) {
			   width = width +1;
		    }else {
			   width = width + 2;
		    }
	    }
	    return width;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println(waldWidth(a,k));
	}

}
