package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileRead {

	public static void main(String[] args) {
		
		String path="C:\\Users\\prashant\\intro\\main.txt";
		
//		String path1="C:\\Users\\prashant\\intro\\exmp.txt";
//		
//		File file= new File(path1);
//		try {
//			file.createNewFile();
//		} catch (IOException e2) {
//			e2.printStackTrace();
//		}
		
		
//		char[] ar=new char[55];
		
		FileReader reader = null;
//		FileWriter writer = null;
		BufferedReader reader2=null;
		

		
		
		try {
			//create an object of file reader
			reader = new FileReader(path);
//			writer = new FileWriter(file);
//			int c = reader.read();
//			while(c!=-1) {
//				writer.write(c);
//				c=reader.read();
//			}
//			writer.flush();
//			System.out.println(reader.read(ar));
//			System.out.println(ar);
			
			
			reader2=new BufferedReader(reader);
			int sum=0;
			String line = reader2.readLine();
			while(line != null) {
				System.out.println(line);
				int l=line.length();
				sum+=l;
				line=reader2.readLine();
			}
			System.out.println(sum);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
}
