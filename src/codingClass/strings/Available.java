package codingClass.strings;

import java.util.Scanner;

public class Available {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();
		System.out.println(available(s,t));
	
	}
	
	static boolean available(String s, String t) {
		int i=0, j=0;
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
				j++;
			}else {
				i++;
			}
		}
		if(j==t.length()) {
			return true;
		}else {
			return false;
		}
	}
}
