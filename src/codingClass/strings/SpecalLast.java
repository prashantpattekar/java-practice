package codingClass.strings;

import java.util.Scanner;

public class SpecalLast {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String res = move(s);
		System.out.println(res);
	}

	private static String move(String s) {
		String res1="";
		String res2="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if((ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z') || (ch>='0'&&ch<='9')) {
				res1=res1+ch;
			}else {
				res2=res2+ch;
			}
		}
		return res1+res2;
	}

}
