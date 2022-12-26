package 멀티소켓채팅;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("172.30.1.92", 2400);
            System.out.println("서버 접속 성공");
            Scanner sc = new Scanner(System.in);
            System.out.println("이름을 설정해주세요.");
            Thread sThread = new sender(socket, sc.nextLine());
            Thread rThread = new receiver(socket);
            sThread.start();
            rThread.start();
            // System.out.println("접속을 종료하겠습니다.");
            // socket.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("서버 접속 실패");
        }
    }
}
class receiver extends Thread {
    Socket socket;

    public receiver(Socket s) {
        socket = s;
    }

    @Override
    public void run() {
        InputStream input;// 읽는 stream
        BufferedReader reader;// input 내용을 buffer로 받아옴
        try {
            while (true) {
                String s = null;
                input = socket.getInputStream();
                reader = new BufferedReader(new InputStreamReader(input)); // 읽기

                if ((s = reader.readLine()) != null) {
                    System.out.println(s);
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class sender extends Thread {
    Socket socket;
    String name;
    Scanner sc;

    public sender(Socket s, String n) {
        sc = new Scanner(System.in);
        socket = s;
        name = n;
    }

    @Override
    public void run() {
        try {
            while (true) {
                OutputStream out = socket.getOutputStream(); // 쓰기
                PrintWriter writer = new PrintWriter(out, true); //
                writer.println(name + ": " + sc.nextLine());

                // writer.flush();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
