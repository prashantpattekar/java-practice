package oops.Static;

class ClassElements{
	// static variables
	static int a;
	static char b;
	
	// static block
	static
	{
		a=23;
		b='c';
		System.out.println("inside static block");
	}
	
	// static method
	static void fun() {
		System.out.println("inside static method");
	}
	
	// instance variables
	private int c;
	private char d;
	
	// instance block
	{
		System.out.println("inside instance block");
	}
	
	// instance methods
	public void fun2() {
		System.out.println("inside instance methods");
	}
	
	// constructor
	public ClassElements() {
		this.c=2334;
		this.d='A';
	}
	
	
	
}

public class Static {
	
	public static void main(String[] args) {
		ClassElements.fun();
		ClassElements s = new ClassElements();
		
		
	}

}
