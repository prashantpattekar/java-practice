package java;

class Customer{
	
    private int cID;
	private String cName;
	private long cNum;
	
	public Customer (int cID, String cName, long cNum) {
		this.cID = cID;
		this.cName = cName;
		this.cNum = cNum;
	}

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public long getcNum() {
		return cNum;
	}

	public void setcNum(long cNum) {
		this.cNum = cNum;
	}
	
//	public void  setData(int a, String b, long c) {
//		cID = a;
//		cName = b;
//		cNum = c;
//	}
//	
//	public int getID() {
//		return cID;
//	}
//	
//	public String getName() {
//		return cName;
//	}
//	
//	public long getNum() {
//		return cNum;
//	}
	
}

public class Encapsulation {
	
	public static void main(String[] args) {
		
//		Customer c1 = new Customer();
//		
//		c1.setData(4, "Prashant", 9743137411L);
//		
//		System.out.println(c1.getID());
//		System.out.println(c1.getName());
//		System.out.println(c1.getNum());
		
		Customer c1 = new Customer(2,"prashant" , 9743137411l);
		
		System.out.println(c1.getcID());

		
	}
}
