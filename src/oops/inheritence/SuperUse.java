package oops.inheritence;

import java.util.Scanner;

class Event {
	private String name;
	private String detail;
	private String type;
	private String ownerName;
	private double costPerDay;
	
	public Event() {
		
	}
	
	public Event(String name,String detail, String type, String ownerName, double costPerDay)
	{
		super();  // control goes to parent class (object ) class constructor
		this.name=name;
		this.detail=detail;
		this.type=type;
		this.ownerName=ownerName;
		this.costPerDay=costPerDay;
	}

	public String getName() {
		return name;
	}

	public String getDetail() {
		return detail;
	}

	public String getType() {
		return type;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public double getCostPerDay() {
		return costPerDay;
	}
	
	
	
}




class Exhibition extends Event{
	private int noOfStall;
	
	
	public Exhibition() {
		
	}
	
	public Exhibition(String name,String detail,String type, 
			String ownerName, double costPerDay,int noOfStall) {
		super(name,detail,type,ownerName,costPerDay);  
		this.noOfStall=noOfStall;
		
		
	}

	public int getNoOfStall() {
		return noOfStall;
	}
	
	public double calculateGST(double costPerDay, int noOfSeats) {
		double gst = costPerDay*noOfSeats*0.05;
		return gst;
	}
	
}


class StageEvent extends Event{
	private int noOfSeats;
	
	
	public StageEvent() {
		
	}
	
	public StageEvent(String name, String details, 
			String type, String ownerName,double costPerDay,int noOfSeats) {
		super(name,details,type,ownerName,costPerDay);
		this.noOfSeats=noOfSeats;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}
	
	public double calculateGST(double costPerDay, int noOfSeats) {
		double gst = costPerDay*noOfSeats*0.15;
		return gst;
	}
}



public class SuperUse {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.Exhibition Event");
		System.out.println("2.Stage Event");
		int  choic = scan.nextInt();
		
		
		
		if(choic == 1) {
			System.out.println("enter the details of exhibation");
			String name = scan.next();
			String detail = scan.next();
			String type = scan.next();
			String ownerName = scan.next();
			double costPerDay = scan.nextDouble();
			int noOfStall = scan.nextInt();
			
			
			System.out.println("enter the starting date of the event");
			String sDate = scan.next();
			System.out.println("Enter the ending date of the event");
			String eDate = scan.next();
			
			
			Exhibition ex = new Exhibition(name,detail,type,ownerName,costPerDay,noOfStall);
			double gst = ex.calculateGST(costPerDay, noOfStall);
			System.out.println(gst);
			
			System.out.println("event name : "+ ex.getName());
			System.out.println("Details : " + ex.getDetail());
			System.out.println("Type : "+ex.getType());
			System.out.println("Organiser name : "+ex.getOwnerName());
			System.out.println("Number of Stalls : "+ ex.getNoOfStall());
			
		}
		else if(choic == 2) {
			System.out.println("enter the details of stage event");
			String name = scan.next();
			String detail = scan.next();
			String type = scan.next();
			String ownerName = scan.next();
			double costPerDay = scan.nextDouble();
			int noOfSeats = scan.nextInt();
			
			
			System.out.println("enter the starting date of the event");
			String sDate = scan.next();
			System.out.println("Enter the ending date of the event");
			String eDate = scan.next();
			
			
			StageEvent se = new StageEvent(name,detail,type,ownerName,costPerDay,noOfSeats);
			double gst = se.calculateGST(costPerDay, noOfSeats);
			System.out.println(gst);
			
		}
		
		else {
			System.out.println("wrong input");
		}
	}

}
