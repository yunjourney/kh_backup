package 소켓시리얼클라이언트;

import 소켓시리얼서버.Employee;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ConnectException;
import java.net.Socket;

public class SocketSerialClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5433);
            InputStream inputStream = socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            Employee emp = (Employee) ois.readObject();
            System.out.println("이름 : " + emp.getName());
            System.out.println("주소 : " + emp.getAddr());
            System.out.println("주민번호 : " + emp.getJumin());
            System.out.println("전화번호 : " + emp.getPhone());
            ois.close();
            socket.close();
        } catch (ConnectException e) {
            System.out.println("연결실패 !!!!!");
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
}