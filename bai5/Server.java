package bai5;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.*;
public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket Server = new ServerSocket(4502);
			System.out.println("Server da duoc tao");
			Socket client = Server.accept();
			System.out.println("Client da ket noi den server");
			Scanner inFromClient = new Scanner(client.getInputStream());
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			String input ="";
			outToClient.println("Nhap chuoi can dao nguoc ");
			  
			   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			   input = bufferedReader.readLine();
			   char []stt = input.toCharArray();
			   for(int i =stt.length-1 ;i>=0;i--){
			    System.out.print(stt[i]);
			   
			   outToClient.println("chuoi la"+stt[i]);
			   }
		}
			  catch(IOException e)
			  {
				 
			  }
			  
		}
	}
	

		
