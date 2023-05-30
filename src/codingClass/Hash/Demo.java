package codingClass.Hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.lang.*;


class Flight implements Comparable<Flight> {
	
	private String departure;
	private String name;
	private float duration;
	private int price;
	
	public Flight() {
		
	}
	
	public Flight(String departure, String name, float duration, int price) {
		this.departure=departure;
		this.name=name;
		this.duration=duration;
		this.price=price;
		
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "[ departure=" + departure+", name="+name+", duration="+duration+
				", price="+price + " ]";
	}

	@Override
	public int compareTo(Flight f2) {
		String s1=this.departure;
		String s2=f2.departure;
		return s1.compareTo(s2);
	}
}

class CompareName implements Comparator<Flight>{
	public int compare(Flight f1,Flight f2) {
		String name1=f1.getName();
		String name2 = f2.getName();
		return name1.compareTo(name2);
	}
}

class CompareDuration implements Comparator<Flight>{

	@Override
	public int compare(Flight f1, Flight f2) {
		Float d1=f1.getDuration();
		Float d2=f2.getDuration();
		return d1.compareTo(d2);
	}
}

class ComparePrice implements Comparator<Flight>{

	@Override
	public int compare(Flight f1, Flight f2) {
		Integer s1=f1.getPrice();
		Integer s2=f2.getPrice();
		return s1.compareTo(s2);
	}
	
}



public class Demo {
	
	public static void main(String[] args) throws Exception {
		Flight f1 = new Flight("21:00","indigo",2.2f,5000);
		Flight f2 = new Flight("23:30","goair",5.0f,7000);
		Flight f3 = new Flight("04:30","spicejet",1.5f,2500);
		Flight f4 = new Flight("16:00","vistara",3.5f,6000);
		Flight f5 = new Flight("21:30","airindia",4.5f,5500);
		Flight f6 = new Flight("09:00","indigo",4.0f,6500);
		Flight f7 = new Flight("11:00","spicejet",3.7f,9000);
		Flight f8 = new Flight("13:00","goair",2.0f,8000);
		
		CompareName compareName = new CompareName();
		CompareDuration compareDuration = new CompareDuration();
		ComparePrice comparePrice = new ComparePrice();
		
//		TreeSet<Flight> f = new TreeSet<Flight>();
//		TreeSet<Flight> f = new TreeSet<Flight>(compareName);
		TreeSet<Flight> f = new TreeSet<Flight>(compareDuration);
//		TreeSet<Flight> f = new TreeSet<Flight>(comparePrice);
//		ArrayList<Flight> f = new ArrayList<Flight>();
		
		f.add(f1);
		f.add(f2);
		f.add(f3);
		f.add(f4);
		f.add(f5);
		f.add(f6);
		f.add(f7);
		f.add(f8);
		
//		Collections.sort(f, new ComparePrice());
		
		for(Flight fl : f) {
			System.out.println(fl);
		}
		
		
	}
}
