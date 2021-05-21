package Section5_Socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) {
        Socket socketOfServer;
        try {
            ServerSocket svSocket = new ServerSocket(65000);
            System.out.println("Server is waiting...");
            while (true){
                socketOfServer = svSocket.accept();
                new Thread(()->{
                    for (int i = 0; i < 10; i++){
                    System.out.println(Thread.currentThread().getName() + " " + i );
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                            e.printStackTrace();
                            }
                        }
                    System.out.println("Finish!");}).start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}