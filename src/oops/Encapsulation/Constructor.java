package oops.Encapsulation;

class Customer1{
	
	private int cID;
	private String cName;
	private long cNum;
	
	
	// constructor overloading // same name but different parameters
	public Customer1() {
		this.cID=555;
		this.cName="Prashant";
		this.cNum=9743137411l;
	}
	
	public Customer1(int cID) {
		this.cID=cID;
	}
	
	public Customer1(String cName) {
		this.cName=cName; 
	}
	
	public Customer1(int cID, String cName, long cNum) {
		this.cID=cID;
		this.cName=cName;
		this.cNum=cNum;
	}
	
	public Customer1(int cID, String cName) {
		this(54); // constructor local chaining //control goes to 0 parameter constructor
		this.cID=cID;
		this.cName=cName;
	}

	public int getcID() {
		return cID;
	}

	public String getcName() {
		return cName;
	}

	public long getcNum() {
		return cNum;
	}
}



class Test extends Customer1{
	
	public Test() {
		super(12,"prashant pattekar", 508925098l);
	}
}

public class Constructor {
	
	public static void main(String[] args) {
		Customer1 c1=new Customer1(123,"prashant");
		System.out.println(c1.getcID());
		System.out.println(c1.getcName());
		System.out.println(c1.getcNum());
		
		
		Customer1 c2 = new Customer1();
		System.out.println(c2.getcID());
		System.out.println(c2.getcName());
		System.out.println(c2.getcNum());
		
		
		Test t = new Test();
		System.out.println(t.getcID());
		System.out.println(t.getcName());
		System.out.println(t.getcNum());
		
		
	}

}
