package bai1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket Server = new ServerSocket(4603);
			System.out.println("Server da duoc tao");
			Socket client = Server.accept();
			System.out.println("Client da ket noi den server");
			Scanner inFromClient = new Scanner(client.getInputStream());
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			String	x ;
			outToClient.println("Nhap so: ");
			  
			   x = inFromClient.nextLine();
			   
			   switch(x)
			   {
			   case "1": 
				  outToClient.println("Day la so mot");
			   		break;
			   case "2": 
				   outToClient.println("Day la so hai");
			   		break;
			   case "3": 
				   outToClient.println("Day la so ba");
			   		break;
			   case "4": 
				   outToClient.println("Day la so bon");
			   		break;
			   case "5": 
				   outToClient.println("Day la so nam");
			   		break;
			   case "6": 
				   outToClient.println("Day la so sau");
			   		break;
			   case "7": 
				   outToClient.println("Day la so bay");
			   		break;
			   case "8": 
				   outToClient.println("Day la so tam");
			   		break;
			   case "9": 
				   outToClient.println("Day la so chin");
			   		break;
			   	default:
			   		outToClient.println("Khong phai la so nguyen");
			   }
		}
			   
			   catch(IOException e)
				  {
					 
				  }
	}

}
