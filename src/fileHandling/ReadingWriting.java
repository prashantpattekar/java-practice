package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class ReadingWriting {
	
	public static void main(String[] args) {
		
		String path="C:\\Users\\prashant\\intro\\exmp.txt";
		String path1="C:\\\\Users\\\\prashant\\\\intro\\\\phone.txt";
		String path2="C:\\Users\\prashant\\intro\\phone_book.txt";
		
		// Creating a reference of FileReader and BufferedReader 
		FileReader reader=null;
		BufferedReader reader1=null;
		
		FileReader reader2=null;
		BufferedReader reader3=null;
		
		//creating a reference of FileWriter
//		FileWriter writer=null;
		PrintWriter writer=null;
		
		try {
			reader = new FileReader(path);
			reader1 = new BufferedReader(reader);
			reader2 = new FileReader(path1);
			reader3 = new BufferedReader(reader2);
			
//			writer = new FileWriter(path2);
			writer = new PrintWriter(path2);
			
			String name = reader1.readLine();
			String phone = reader3.readLine();
			int i=1;
			while(name != null && phone != null) {
				if(i<10) {
					writer.write(i);
				}else if(i>=10 && i<100) {
					writer.write(i+" ");
				}
				
				writer.write( name+" : "+phone + "\n");
				
				
				name = reader1.readLine();
				phone = reader3.readLine();
				i++;
			}
			
			writer.flush();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e1) {
			e1.printStackTrace();
		}
		
		
	}
}
