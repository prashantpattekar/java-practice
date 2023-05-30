package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable{
	
	private String name;
	private long crn;
	private float balance;
	
	public Customer() {
		
	}
	
	public Customer(String name, long crn, float balance) {
		this.name=name;
		this.crn=crn;
		this.balance=balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCrn() {
		return crn;
	}

	public void setCrn(long crn) {
		this.crn = crn;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
}

public class Serialization {
	
	public static void main(String[] args) {
		
		
		// for Serialization
//		Customer customer = new Customer("alex",12345678,2000.0f);
//		String path = "C:\\Users\\prashant\\intro\\serialization.txt";
//		
//		File file = new File(path);
//		FileOutputStream fos = null;
//		ObjectOutputStream oos = null;
//		
//		try {
//			file.createNewFile();
//			fos=new FileOutputStream(path);
//			oos=new ObjectOutputStream(fos);
//			
//			oos.writeObject(customer);
//			oos.flush();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		
//		try {
//			fos.close();
//			oos.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		
		// for deSerializatio
		
		String path = "C:\\Users\\prashant\\intro\\serialization.txt";
		
		FileInputStream fis =null;
		ObjectInputStream ois = null;
		
		
		try {
			
			fis=new FileInputStream(path);
			ois=new ObjectInputStream(fis);
			
			Customer customer = (Customer)ois.readObject();
			System.out.println(customer.getName());
			System.out.println(customer.getCrn());
			System.out.println(customer.getBalance());
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
