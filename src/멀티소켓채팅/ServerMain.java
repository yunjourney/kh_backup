package 멀티소켓채팅;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerMain extends Thread{

    public static void main(String[] args) {
        int socket = 2400;
        try {
            ServerSocket ss = new ServerSocket(socket);
            System.out.println("서버 열림");
            while (true) {
                Socket user = ss.accept();
                System.out.println("클라이언트 입장 " + user.getLocalAddress() + " : " + user.getLocalPort());
                Thread serverThread = new ServerSocketTh(user);
                serverThread.start();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class ServerSocketTh extends Thread {
    static List<Socket> users = new ArrayList<>();
    Socket socket;
    public ServerSocketTh(Socket socket) {
        this.socket = socket;
        users.add(socket);
    }
    @Override
    public void run() {
        try {
            while (true) {
                String s;
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input)); // 읽기
                if ((s = reader.readLine()) != null) {
                    System.out.println(s);
                    for (int i = 0; i < users.size(); i++) {
                        OutputStream out = users.get(i).getOutputStream(); // 쓰기
                        PrintWriter writer = new PrintWriter(out, true); //
                        writer.println(s);
                        // writer.flush();
                    }
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}