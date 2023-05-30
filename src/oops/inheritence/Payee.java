package oops.inheritence;

public class Payee {
	
	private String name;
	private String bankName;
	private String ifscCode;
	private String aadharId;
	private double amount;
	
	public Payee addPayee(String name, String bankName, String ifscCode, double depositeAmount){
		this.name=name;
		this.bankName=bankName;
		amount = amount + depositeAmount;
		
		Payee p = new Payee();
		return p;
	}
	
	public Payee addPayee(String name, String bankName, double depositeAmount) {
		this.name=name;
		this.bankName=bankName;
		amount = amount+depositeAmount;
		Payee p = new Payee();
		return p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public static void main(String[] args) {
		
	}
	

}


