package oops.poly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SimpleHTTPServer {

	
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(8080);
		System.out.println("Listening for connection on port 8080 ...");
		while(true) {
			try(Socket accept = server.accept()){
				Date today = new Date();
				String httpResponse = "HTTP/1.1 200 OK\r\n\r\n"+ today;
				accept.getOutputStream()
				.write(httpResponse.getBytes("UTF-8"));
			}
			
		}
		
	}
}
