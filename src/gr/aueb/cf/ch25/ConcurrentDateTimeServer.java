package gr.aueb.cf.ch25;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

public class ConcurrentDateTimeServer implements Runnable {

    private final Socket sockFd;

    public ConcurrentDateTimeServer(Socket sockFd) {
        this.sockFd = sockFd;
    }

    @Override
    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sockFd.getOutputStream()))) {
            bw.write(new Date().toString());
            bw.flush();
            sockFd.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
