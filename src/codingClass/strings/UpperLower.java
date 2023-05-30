package codingClass.strings;

import java.util.Scanner;

public class UpperLower {
	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(swapCase(s));
	
		
	}

	static String toUpperCase(String s) {
		String res="";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>=97 && s.charAt(i)<=122) {
				res = res+(char)(s.charAt(i)-32);
			}
			else {
				res = res+s.charAt(i);
			}
		}
		return res;
	}
	
	static String toLowerCase(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=90) {
				res = res+(char)(s.charAt(i)+32);
			}
			else {
				res = res+s.charAt(i);
			}
		}
		return res;
	}
	
	static String swapCase(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				res = res+(char)(ch+32);
			}
			else if(ch>='a' && ch<='z') {
				res = res+(char)(ch-32);
			}
			else {
				res = res + ch;
			}
		}
		return res;
	}
}
