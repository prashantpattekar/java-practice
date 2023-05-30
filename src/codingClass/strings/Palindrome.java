package codingClass.strings;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(isPalindrome1(s));
		
	}
	
	static boolean isPalindrome(String s) {
		String res = "";
		for(int i=s.length()-1; i>=0; i--) {
			res = res+s.charAt(i);
		}
		if(s.equals(res)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static boolean isPalindrome1(String s) {
		int i=0, j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}
}
