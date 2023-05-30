package oops;

import java.util.Scanner;

class Demo1{
	void fun1()throws Exception{
		try {
			System.out.println("connection4 estd");
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the numeretor");
			int a = scan.nextInt();
			System.out.println("enter the denomentor");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("some problem occured");
			throw e;
		}
		finally {
		System.out.println("connection4 is terminated");
		}
	}
}

class Demo2{
	
	void fun2(){
		System.out.println("connection3 estd");
		try {
			Demo1 d1 = new Demo1();
			d1.fun1();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
		System.out.println("connection3 terminated");
	}
}

class Demo3 {
	
	void fun3() {
		System.out.println("connection2 is estd");
		Demo2 d2 = new Demo2();
		d2.fun2();
		System.out.println("connection2 is terminated");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		
		
		
	}
}








