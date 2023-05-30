package test;

public class Main {
	
	public static void main(String[] args) {
//		System.out.println(fun(5));
		System.out.println(countSetBits(55));
	}
	
	public static char fun(int n) {
		
		int a=1,b=1,c=1;
		int index=0;
		String s="abcdefghijklmnopqrstuvwxyz";
		
		while(c<n) {
			c=a+b;
			index++;
			a=b;
			b=c;
		}
		
		char ch=s.charAt(index%26);
		return ch;
	}
	
	public static int countSetBits(int n) {
		int count=0;
		while(n>0) {
			n=n&(n-1);
			count++;
		}
		return count;
	}

}
