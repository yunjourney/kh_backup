package 소켓시리얼서버;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketSerialServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(5433);
            while(true) {
                System.out.println("서버 실행 중..");
                Socket socket = serverSocket.accept();
                OutputStream outputStream = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(outputStream);
                Employee emp = new Employee("우영우", "서울시 강남구", "863312-1111111", "010-5006-1234");
                oos.writeObject(emp);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}