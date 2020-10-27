package bai2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket Server = new ServerSocket(1036);
			System.out.println("Server da duoc tao");
			Socket client = Server.accept();
			System.out.println("Client da ket noi den server");
			Scanner inFromClient = new Scanner(client.getInputStream());
			PrintStream outToClient = new PrintStream(client.getOutputStream());
			outToClient.println("Tim hoc cuon sach co tua nay coi: ");
			String chu = inFromClient.nextLine();
			System.out.println("client: " + chu);
			
			BufferedReader br = null;

	        try {   
	            br = new BufferedReader(new FileReader("C:\\Users\\Admin\\eclipse-workspace\\Tuan3\\src\\FileNayLafiledocument.txt"));       

	            System.out.println("Đọc nội dung file sử dụng phương thức readLine()");

	            String textInALine;

	            while ((textInALine = br.readLine()) != null) {
	                System.out.println(textInALine);
	                textInALine = br.readLine();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
			
			outToClient.println("Tim thay");
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
}

        