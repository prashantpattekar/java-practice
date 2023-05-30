package oops.inheritence;

import java.util.Scanner;

class Account {
	protected String accName;
	protected String accNo;
	protected String bankName;
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	void display() {
		System.out.println("Account name : "+accName);
		System.out.println("Account no : "+accNo);
		System.out.println("Bank name : "+bankName);
	}
}


class CurrentAccount extends Account{
	private String tinNumber;
	
	public CurrentAccount() {

		
	}
	
	public CurrentAccount(String accName,String accNo, String bankName, String tinNumber) {
		this.accName=accName;
		this.accNo=accNo;
		this.bankName=bankName;
		this.tinNumber=tinNumber;
	}

	public String getTinNumber() {
		return tinNumber;
	}
	
	void display() {
		super.display();
		System.out.println("TIN Number : "+tinNumber);
	}
}

class SavingsAccount extends Account{
	
	private String orgName;
	
	public SavingsAccount() {
	
	}
	
	public SavingsAccount(String accName, String accNo, String bankName, String orgName) {
		this.accName=accName;
		this.accNo=accNo;
		this.bankName=bankName;
		this.orgName=orgName;
	}

	public String getOrgName() {
		return orgName;
	}
	
	void display() {
		super.display();
		System.out.println("Organization name : "+orgName);
	}
}


//driver class
public class Main2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("choose Account type");
		System.out.println("1) saving account");
		System.out.println("2) current account");
		int accType = scan.nextInt();
		if(accType==1) {
			System.out.println("enter account details in comma separeted");
			String accName = scan.next();
			String accNo = scan.next();
			String bankName = scan.next();
			String orgName = scan.next();
			SavingsAccount sa = new SavingsAccount(accName, accNo, bankName, orgName);
			sa.display();
		}else if(accType==2) {
			System.out.println("enter account details in comma separeted");
			String accName = scan.next();
			String accNo = scan.next();
			String bankName = scan.next();
			String tinNum = scan.next();
			CurrentAccount ca = new CurrentAccount(accName, accNo, bankName, tinNum);
			ca.display();
		}
		else {
			System.out.println("wrong account type");
		}
	}

}
