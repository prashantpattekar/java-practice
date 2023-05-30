package codingClass.day3;
import java.util.Scanner;
public class Ascii {
	
	
	// checks lower case value or not
	static String lowercase(int a ) {
		if (a>=97 && a<=122) {
			return "yes";
		}else 
			return "no";
	}
	
	    // checks upper case value or not
		static String uppercase(int a ) {
			if (a>=65 && a<=90) {
				return "yes";
			}else 
				return "no";
		}
		
		
		// checks number ascii value or not 
		static String number(int a ) {
			if (a>=48 && a<=57) {
				return "yes";
			}else 
				return "no";
		}
	
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		// prints integer equivalent ascii character
//		System.out.println("enter a number ");
//		int n = scan.nextInt();
//		char ch=(char)n;
//		System.out.println(ch);
		
		// prints ascii value of character
//		System.out.println("enter a character");
//		char ch = scan.next().trim().charAt(0);
//		int n = (char) ch;
//		System.out.println(n);
//		
		
		System.out.println("enter a number ");
		int n = scan.nextInt();
		System.out.println(uppercase(n));
				
		
		
	}

}
