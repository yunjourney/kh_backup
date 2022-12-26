package 소켓서버Thread;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread {
    private final Socket socket;
    Scanner sc = new Scanner(System.in);

    public SendThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            String sendString = "";
            while(true) {
                sendString = sc.nextLine();
                outputStream.writeUTF(sendString);
                outputStream.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}