package oops.inheritence;

import java.util.Scanner;

class CreditCard{
	private String number;
	private String holderName;
	private double amount;
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}



class TravelCreditCard extends CreditCard{
	private double exchangePercentage;

	public double getExchangePercentage() {
		return exchangePercentage;
	}

	public void setExchangePercentage(double exchangePercentage) {
		this.exchangePercentage = exchangePercentage;
	}
	
}




class RewardsCreditCard extends CreditCard{
	private double creditPoints;

	public double getCreditPoints() {
		return creditPoints;
	}

	public void setCreditPoints(double creditPoints) {
		this.creditPoints = creditPoints;
	}
	
	double calculateAmount(double amount, int numberofPersons) {
		 double res =( amount * numberofPersons ) - (amount * numberofPersons * 0.05);
		 return res;
	}
	
}



class InternationalCard extends TravelCreditCard{
	
	
	double calculateAmount(double amount, int numberofPersons) {
	    double res=(numberofPersons *amount)-(amount * numberofPersons * 0.10);
	    return res;
	}
}


public class Main1 {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the travel details ");
		System.out.println("Travel place");
		String place = scan.nextLine();
		System.out.println("enter the number of tickets");
		int numberofTickets = scan.nextInt();
		System.out.println("cost per Ticket");
		double cost = scan.nextDouble(); 
		System.out.println("1)Travel CreditCard");
		System.out.println("2)Reward CreditCard");
		System.out.println("enter credit card type");
		int n = scan.nextInt();
		if(n==1||n==2) {
			System.out.println("1)International");
			System.out.println("2)National");
			System.out.println("enter travel credit card type");
			int y = scan.nextInt();
			scan.nextLine();
			
			if(y==1) {
				System.out.println("enter creditcard number");
				String number = scan.nextLine();
				System.out.println("enter the name");
				String name = scan.nextLine();
				System.out.println("enter the available amount");
				double amount = scan.nextDouble();
				InternationalCard tc = new InternationalCard();
				System.out.print("hello "+name+" you have to pay Rs ");
				  double calculateAmount = tc.calculateAmount(cost, numberofTickets);
				  System.out.println(calculateAmount);
			}else if(y==2) {
				System.out.println("enter creditcard number");
				String number = scan.nextLine();
				
				System.out.println("enter the name");
				
				String name = scan.nextLine();
				
				System.out.println("enter the available amount");
	
				double amount = scan.nextDouble();
				RewardsCreditCard tc = new RewardsCreditCard();
				System.out.print("hello "+name+" you have to pay Rs ");
				  double calculateAmount = tc.calculateAmount(cost, numberofTickets);
				  System.out.println(calculateAmount);
			}
			else{
				System.out.println("invalid card");
			}
		}
		else {
			System.out.println("invalid card");
		}
	}
	

}















