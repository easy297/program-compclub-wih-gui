

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(546);
            while(true) {
                System.out.println("WAITING...");
                Socket socket = server.accept();
                System.out.println("SUCCESSFULLY CONNECT");


            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
