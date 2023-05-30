package codingClass.strings;

import java.util.Scanner;

public class ReverseAndCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		String s = scan.nextLine();
//		String res = reverse(s);
//		System.out.println(res);
//		printCh(s);
//		int res = countConsonts(s);
//		System.out.println(res);
		count(s);
		
	}
	
	static String reverse(String s) {
		String res = "";
		for(int i=s.length()-1; i>=0; i--) {
			res=res+s.charAt(i);
		}
		return res;
	}
	
	static void printCh(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			System.out.println(ch);
		}
	}
	
	static int countCh(String s) {
		int count=0;
		for(int i=0; i<s.length(); i++) {
			count++;
		}
		return count;
	}
	
	static int countSpaces(String s) {
		int count=1;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		return count;
	}
	
	static int countWords(String s) {
		int count=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		return count;
	}
	
	static int countLowerCase(String s) {
		int count=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				count++;
			}
		}
		return count;
	}
	
	static int countUpperCase(String s) {
		int count=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
				count++;
			}
		}
		return count;
	}
	
	static int countAlphaNumeric(String s) {
		int count=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
				count++;
			}
		}
		return count;
	}
	
	static int countVovels(String s) {
		int count=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if((ch=='a' || ch=='e' || ch=='i'  || ch=='o'  || ch=='u'
				|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')){
				count++;
			}
		}
		return count;
	}
	
	static int countConsonts(String s) {
		int count=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
				if((ch=='a' || ch=='e' || ch=='i'  || ch=='o'  || ch=='u'
						|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')) {
					
				}
				else count++;
			}
		}
		return count;
	}
	
	
	
	static void count(String s) {
		int vc=0, cc=0, nc=0, sc=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if((ch=='a' || ch=='e' || ch=='i'  || ch=='o'  || ch=='u'
				|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')){
				vc++;
			}
			else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				cc++;
			}
			else if(ch>='0' && ch<='9') {
				nc++;
			}
			else {
				sc++;
			}
		}
		System.out.println("vc = "+vc);
		System.out.println("sc = "+cc);
		System.out.println("nc = "+nc);
		System.out.println("sc = "+sc);

	}
}
