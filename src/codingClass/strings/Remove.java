package codingClass.strings;

import java.util.Scanner;

public class Remove {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String res = removeVovels(s);
		System.out.println(res);
	}

	static String removeSpecial(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			char ch =s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')) {
				res = res+ch;
			}
		}
		return res;
	}
	
	static String removeUpper(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			char ch =s.charAt(i);
			if(ch>='A' && ch<='Z') {	
			}
			else {
				res = res+ch;
			}
		}
		return res;
	}
	
	static String removeLower(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			char ch =s.charAt(i);
			if(ch>='a' && ch<='z') {	
			}
			else {
				res = res+ch;
			}
		}
		return res;
	}
	
	static String removeAlphaNumeric(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			char ch =s.charAt(i);
			if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9') )  {	
			}
			else {
				res = res+ch;
			}
		}
		return res;
	}
	
	static String removeVovels(String s) {
		String res = "";
		for(int i=0; i<s.length(); i++) {
			char ch =s.charAt(i);
			if( ch=='a' || ch=='e' || ch=='i'  || ch=='o'  || ch=='u'
					|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )  {	
			}
			else {
				res = res+ch;
			}
		}
		return res;
	}
	
	
}
