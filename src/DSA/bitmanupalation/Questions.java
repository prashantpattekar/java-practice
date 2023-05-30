package DSA.bitmanupalation;

import java.util.Scanner;

public class Questions {
	
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int res = countSetBits(n);
		int[] arr = {1,2,3,4,3,2,1};
		System.out.println(reverse(n));
		
	}
	
	
	// count set bits // right set bits // brian kernighan's algorithm
	static int countSetBits(int n) {
		int count = 0;
		while(n>0) {
			n=n&(n-1);
			count++;
		}
		return count;
	}
	
	// number is power of 2 or not
	static boolean powOf2(int n) {
		if(n==0) {
			return false;
		}
		return (n&(n-1))==0;
	}
	
	
	// find unique element in the array
	static int lonelyInteger(int[] arr) {
		int res=0;
		for(int i : arr) {
			res = res^i;
		}
		return res;
	}
	
	// consecutive 1's in a binary representation of number
	static int countConsecutive(int n) {
		int count = 0;
		while(n>0) {
			n = (n&(n<<1));
			count++;
		}
		return count;
	}
	
	// number of trailing zeros in a binary representation of number
	static int trailingZeros(int n) {
		return (int) (Math.log10((n&n-1^n))/Math.log10(2));
	}
	
	// reverse all bits of a binary representation of number
	static int reverse(int n) {
		int f=31, l=0;
		int rev=0;
		while(f>l) {
			if((n&(1<<f))!=0) {
				rev=rev|(1<<l);
			}
			if((n&(1<<l))!=0) {
				rev=rev|(1<<f);
			}
			f--;
			l++;
		}
		return rev;
	}
}
