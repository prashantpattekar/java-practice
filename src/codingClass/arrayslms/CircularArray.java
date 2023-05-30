package codingClass.arrayslms;

import java.util.HashSet;
import java.util.Scanner;

public class CircularArray {
	
	static int[] circularArrayRotation(int[] a, int k , int[] q) {
		int[] res = new int[q.length];
		int[] b = new int[a.length];
		for(int i=0; i<a.length; i++) {
			b[(i+k)%a.length]= a[i];
		}
		for(int i=0; i<q.length; i++) {
			res[i]=b[q[i]];
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int q = scan.nextInt();
		int[] a = new int[n];
		int queries[] = new int[q];
		for(int i=0; i<a.length; i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0; i<queries.length; i++) {
			queries[i]=scan.nextInt();
		}
		
		int[] res = circularArrayRotation(a, k, queries);
	}
	
}
