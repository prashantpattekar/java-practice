package codingClass.arrays;

import java.util.ArrayList;

class Test{
	private static int x;
	private int y;
	int z;
	
	static {
//		System.out.println("inside a static block");
		x=10;
	}
	
	public Test(){
		super();
	}
	public Test(int x, int y, int z){
		super();
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public Test(int y, int z) {
		this();
		this.y = y;
		this.z = z;
	}
	public static int getx() {
		return x;
	}
	
	public int gety() {
		return y;
	}
	
	public int getz() {
		return z;
	}

	
	
}
public class Demo  {

	static {
//		System.out.println("inside static block");
	}
	
	public static void main(String[]args) {
	
		
//		 Test t = new Test(20,33);
//		 System.out.println(t.getx());
//		 System.out.println(t.gety());
//		 System.out.println(t.getz());
		
		
		
		ArrayList<Object> al = new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(44);
		al.add(55);
		al.add(30);
		System.out.println(al);
		al.add(2,55);
		System.out.println(al);
		ArrayList<Object> b =new ArrayList<>();
		b.add(33);
		b.add("prashant");
		b.add(true);
		System.out.println(b);
		al.addAll(b);
		System.out.println(al);
		System.out.println(al.indexOf(55));
		al.addAll(2, b);
		System.out.println(al);
		System.out.println(al.contains("prashant"));
		System.out.println(al.get(3));
		System.out.println(al.subList(0, 5));
		al.remove(2);
		al.remove(new Integer(44));
		al.removeAll(b);
		System.out.println(al);
		al.retainAll(b);
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.addAll(b);
		System.out.println(al);
		System.out.println(al.size());
		al.ensureCapacity(4);

		
		 
	}

}
























