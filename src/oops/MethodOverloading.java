package oops;

class Printer{
	
	public void print(int a) {
		System.out.println(a);
	}
	
	public void print(float a) {
		System.out.println(a);
	}
	
	public void print(char a) {
		System.out.println(a);
	}
	
	public void print(boolean a) {
		System.out.println(a);
	}
	
	public void print(long a) {
		System.out.println(a);
	}
	
	public void print(double a) {
		System.out.println(a);
	}
	
	public void print(int a, int b) {
		System.out.println(a+" "+b);
	}
	
	public void print(int a,char c) {
		System.out.println(a+" "+c);
	}
	
	public void print(int a,double b) {
		System.out.println(a+" "+b);
	}
	
	public void print(int a, float b) {
		System.out.println(a+" "+b);
	}
}

class Rectangle{
	
	
	// closet match for the 2 integers thus this method is  executes if 2 integers is passed in parameter 
	float area(int l, float b) { 
		return l*b;
	}
	
	double area(double l, double b) {
		return l*b;
	}
}

class Printer1{
	// ambiguous error explanation
	
	
	public void print(int a,float b) {
		System.out.println(a+" " +b);
	}
	
	public void print(float a, int b) {
		System.out.println(a+" "+b);
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		
//		int a=23;
//		char b='A';
//		double c = 321412;
//		boolean d=true;
//		
//		Printer p = new Printer();
//		p.print(a);
//		p.print(d);
//		p.print(a, c);
		
		
//		int a=10; 
//		int b=10;
//		float c=10.0f;
//		Rectangle r = new Rectangle();
//		
//		System.out.println(r.area(a, c));
		
		Printer1 p = new Printer1();
		int a=10;
		int b=20;
//		p.print(a, b); // ambiguous error type promotion is not possible
		
	}
}
