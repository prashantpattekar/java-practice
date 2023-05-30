package codingClass.strings;

import java.util.Scanner;

public class RemoveStartAndEndSpaces {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String res = removeSpace(s);
		System.out.println(res);
	}

	private static String removeSpace(String s) {
		String res="";
		int si=0,ei=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ') {
				si=i;
				break;
			}
		}
		
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i)!=' ') {
				ei=i;
				break;
			}
		}
		
		for(int i=si; i<=ei; i++) {
			res=res+s.charAt(i);
		}
		
		return res;
	}

}
