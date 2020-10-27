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
			ServerSocket Server = new ServerSocket(4500);
			System.out.println("Server da duoc tao");
			Socket client = Server.accept();
			System.out.println("Client da ket noi den server");
			Scanner inFromClient = new Scanner(client.getInputStream());
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			outToClient.println("Tui muon tinh binh phuong cua: ");
			int so = inFromClient.nextInt();
			System.out.println("clien: " + so);
			outToClient.println("Cua fen day: " + so + " binh phuong bang " + so*so);
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	

}
