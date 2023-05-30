package oops.inheritence;

import java.util.Scanner;

class Customer{
	private String name;
	private String address;
	private int age;
	private String mobileNumber;
	
	void displayCustomer(){
		System.out.println("Bill Details");
		System.out.println("name "+name);
		System.out.println("mobile "+ mobileNumber);
		System.out.println("age " + age);
		System.out.println("address " + address);
	}
	
	public void setData(String name,String address, int age, String mobileNumber) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}
}

class PrivilegeCustomer extends Customer{
	
	static double generateBillAmount(double amount) {
		double res =amount - (amount*0.30);
		return res;
	}
}

class SeniorCitizenCustomer extends Customer{
	static double generateBillAmount(double amount) {
		double res =amount -(amount*0.12);
		return res;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Customer c1 = new Customer();
		
		System.out.println("1)Privilage Customer");
		System.out.println("2)SeniorCitizen Customer");
		
		System.out.println("enter customer Type");
		int type = scan.nextInt();
		if(type>=3) {
			System.out.println("invalid customer");
			return;
		}
		System.out.println("enter the name");
		String name = scan.next();
		System.out.println("enter the age");
		int age = scan.nextInt();
		System.out.println("enter the address");
		String address = scan.next();
		System.out.println("enter the mobile number");
		String mobileNumber = scan.next();
		System.out.println("enter the purchased amount");
		double amount = scan.nextDouble();
		
		
		
		if(type == 1) {
			PrivilegeCustomer pc = new PrivilegeCustomer();
			pc.setData(name, address, age, mobileNumber);
			pc.displayCustomer();
			System.out.println("your bill amount is Rs " +amount + 
					" your bill amount"
					+ " is discount under privilege customer");
			double res = PrivilegeCustomer.generateBillAmount(amount);
			System.out.println("you have to pay Rs "+ res);
		}
		else if(type == 2) {
			SeniorCitizenCustomer sc = new SeniorCitizenCustomer();
			sc.setData(name, address, age, mobileNumber);
			sc.displayCustomer();
			System.out.println("your bill amount is Rs " +amount + 
					" your bill amount"
					+ " is discount under privilege customer");
			double res = SeniorCitizenCustomer.generateBillAmount(amount);
			System.out.println("you have to pay Rs "+ res);
		}
		
		
	}
}
