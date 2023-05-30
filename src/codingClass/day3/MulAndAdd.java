package codingClass.day3;

import java.util.Scanner;

public class MulAndAdd {
	
	static int mulandadd(int a, int b) {
		if(a%2==0 && b%2==0) {
			int mul = a*b;
			return mul;
		}
		else {
		     int add = a+b;
		     return add;
		}
	}
	
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter first number");
		int a = scan.nextInt();
		System.out.println("enter second number");
		int b = scan.nextInt();
		System.out.println(mulandadd(a,b));
		
	}
	

}
