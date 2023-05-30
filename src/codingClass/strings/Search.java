package codingClass.strings;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s = scan.nextLine();
		char key = scan.next().charAt(0);
		int i = indexOf(s,key);
		System.out.println(i);
	}

	private static int indexOf(String s, char key) {

		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==key) {
				return i;
			}
		}
		return -1;
	}
}
