package DSA.recursion;

import java.util.Scanner;

public class Recursion extends Object {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = scan.nextInt();
		int k = scan.nextInt();
//		String s = scan.next();
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};

		System.out.println(jos(n, k));
		scan.close();
	}

	// factorial of a number
	static long fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}

	// n'th term of fibonacci series
	static int fibo(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibo(n - 1) + fibo(n - 2);
	}

	// print first n natural numbers
	static void printN(int n) {
		if (n == 0) {
			return;
		}
		printN(n - 1);
		System.out.println(n);
	}

	// count the number of digits
	static int countDigits(int n) {
		if (n == 0) {
			return 0;
		}
		return countDigits(n / 10) + 1;
	}

	// sum of all digits
	static int sumOfDigits(int n) {
		if (n == 0) {
			return 0;
		}
		return sumOfDigits(n / 10) + n % 10;
	}

	// reverse a given string
	static String reverse(String s, String r, int i) {
		if (i < 0) {
			return r;
		}
		return reverse(s, r + s.charAt(i), i - 1);
	}

	// palindromic string or not
	static boolean isPalindrome(String s, int i, int j) {
		if (s.charAt(i) != s.charAt(j)) {
			return false;
		}
		if (j <= i) {
			return true;
		}

		return isPalindrome(s, i + 1, j - 1);
	}

	// sum of elements in an array
	static int sumOfArray(int[] arr, int i) {
		if (i == arr.length) {
			return 0;
		}
		return sumOfArray(arr, i + 1) + arr[i];
	}

	// Josephus problem
	static int jos(int n, int k) {
		if (n == 1) {
			return 0;
		}
		return (jos(n - 1, k) + k) % n;
	}

}
