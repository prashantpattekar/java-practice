package fileHandling;
import java.io.File;
import java.io.IOException;

public class Intro {
	public static void main(String[] args) {
		// specify the directory in which file exists
		String path="C:\\Users\\prashant\\intro\\main.txt";
		
		// Create an object of a file
		File file = new File(path);
		
		// exists() will return true with the file
		//exists in that directory else it will return false
//		System.out.println(file.exists());
		
		// canWrite() will check whether the file is readable or not
//		System.out.println(file.canWrite());
		
		// getName() will return the name of the file
//		System.out.println(file.getName());
		
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		String[] list = file.list();
//		for(String s:list) {
//			System.out.println(s);
//		}
		
		file.delete();
		
		
	}
}
