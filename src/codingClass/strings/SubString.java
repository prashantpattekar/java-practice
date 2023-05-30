package codingClass.strings;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		longestPalindromicSubString(s);
	}

	private static void subString(String s, int k) {
		for(int i=0; i<s.length()-k; i++) {
			String ss = "";
			for(int j=i; j<i+k; j++) {
				ss=ss+s.charAt(j);
			}
			System.out.println(ss);
		}
	}
	
	private static void subStringAny(String s) {
		for(int k=1; k<s.length()-1; k++) {
			String ss = "";
			for(int i=0; i<s.length()-k; i++) {
				for(int j=i; j<i+k; j++) {
					ss=ss+s.charAt(j);
				}
				System.out.println(ss);
			}
		}
	}
	
	static void palindromicSubString(String s, int k) {
		for(int i=0; i<s.length()-k; i++) {
			String ss="";
			for(int j=i; j<i+k; j++) {
				ss=ss+s.charAt(j);
			}
			if(isPalindrome(ss)) {
				System.out.println(ss);
		    }
		}
	}
	
	static void longestPalindromicSubString(String s) {
		for(int k=s.length(); k>=1; k--) {
			for(int i=0; i<s.length()-k; i++) {
				String ss="";
				for(int j=i; j<i+k; j++) {
					ss=ss+s.charAt(j);
				}
				if(isPalindrome(ss)) {
					System.out.println(ss);
					return;
			    }
			}
		}
	}
	
	
	static boolean isPalindrome(String s) {
		int i=0, j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}else return false;
		}
		return true;
	}
}
