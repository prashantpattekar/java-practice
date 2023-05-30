package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrit {
	
	public static void main(String[] args) {
		
		
		// directory in which file exists
		String path="C:\\Users\\prashant\\intro\\name.txt";
		
		//Create an object of a file
		File file = new File(path);
		
//		Scanner scan = new Scanner(System.in);
		
		FileWriter writer;
		
		// Create an object of file writer
		try {
			
//			String n=scan.nextLine();
//			String n2=scan.next();
//			String n3=scan.next();
			
//			writer = new FileWriter(file);
			// Previous data is not overridden it will append to previous data
			writer = new FileWriter(file);
			
			// call the write() and pass the string to be written inside the file
			writer.write("");
			
			
//			writer.write(n);
//			writer.write(n2);
//			writer.write(n3);
			
			// call flush() to push the string in file
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
