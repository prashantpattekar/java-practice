package codingClass.day3;

import java.util.Scanner;

public class PositiveOrNegetive {
	
	
	static int largestof3(int a, int b, int c) 
	{
		int max = a;
		if(b>max) {
			max = b;
		}
		if (c>max) {
			max = c;
		}
		return max;
	}
	
	
	
	static int largest (int a, int b) {
	    if(a<b) {
			return b;
		}else 
			return a;
	}
	
	
	
	static int smallest (int a, int b) {
	    if(a<b) {
			return a;
		}else 
			return b;
	}
	
	
	
	
	//finds the absolute value of the int 
	static int absolute(int a) {
		if (a<0) {
			a=a*-1;
			return a;
		}else
			return a;
	}
	
	
	
	
	//checks given int is positive or negetive
	static String check(int a) {
		if (a>0) {
			return "positive";
			}
		else if (a<0) {
			return "negetive";
		}
		else if (a==0) {
			return "zero";
		}
		return null;
	}
	
	//reminder 
	static int reminder(int a, int b) {
		if(a>b) {
			int rem = a%b;
			return rem;
		}
		else 
			return -1;
	}
	
	
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter three number");
		int a = scan.nextInt();
		int b = scan.nextInt();
		//int c = scan.nextInt();
		System.out.println(reminder(a,b));
	}

}
