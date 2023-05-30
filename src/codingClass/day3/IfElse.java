package codingClass.day3;
import java.util.Scanner;
public class IfElse {
	
	static String evenorodd(int a) {
		if(a%2==0)
			return "yes";
		else return "no";
	}
	
	
	static String multipleof10(int a) {
		if (a%10==0)
			return "YES";
			else return "NO";
	}
	
	static String multipleof5(int a) {
		if (a%5==0)
			return "YES";
			else return "NO";
	}
	
	static String multipleof3and5(int a ) {
		if (a%5 == 0 && a%3 == 0) {
			return "YES";
		}else
			return "NO";
	}
	
	
	static String multipleof3and5and7(int a ) {
		if (a%5 == 0 && a%3 == 0 && a%7==0) {
			return "YES";
		}else
			return "NO";
	}
	
	
	static String twodigit(int a ) {
		if (a>=10 && a<100)
			return "YES";
			else return "NO";
	}
	
	
	static String threedigit(int a ) {
		if (a>=100 && a<1000)
			return "YES";
			else return "NO";
	}
	
	
	static String threedigitandmultiple(int a) {
		if(a>100 && a <1000 && a%10==0) {
			return "YES";
		}else
			return "NO";
	}
	
	
	static String endswith0ornot(int a) {
		if (a%10==0) {
			return "YES";
		}else 
			return "NO";
	}
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
//		if(num%2 == 0) {
//			System.out.println("number is even");
//		}else
//			System.out.println("number is odd");
		System.out.println(endswith0ornot(num));
		
	}

}
