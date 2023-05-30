package codingClass.strings;

import java.util.Scanner;

public class SumNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int res = sumNum(s); 
	}

	
	//abcd345dh :input
	//abcddh12  :output
	private static int sumNum(String s) {

		String res = "";
		int sum = 0;
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if((ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z')) {
				res=res+ch;
			}else if((ch>='0'&&ch<='9')) {
				sum=sum+(ch-48);
			}
		}
		System.out.println(res+sum);
		return sum;
	}
}
