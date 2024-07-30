package gr.aueb.cf.ch25;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ConcurrentDateTimeServerApp {

    private static final int PORT = 13;

    public static void main(String[] args) {
        try (ServerSocket servFd = new ServerSocket()) {
            servFd.bind(new InetSocketAddress("127.0.0.1", PORT));
            System.out.println("DateTime Server has started ...");

            for (;;) {
                Socket connectedFd = servFd.accept();
                Thread socketThread = new Thread(new ConcurrentDateTimeServer(connectedFd));
                socketThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
