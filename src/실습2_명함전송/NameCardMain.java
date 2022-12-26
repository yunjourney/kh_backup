package 실습2_명함전송;

import java.io.IOException;
import java.net.Socket;

public class NameCardMain {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8900);
            System.out.println("서버 접속 성공");


        } catch (Exception e) {
            System.out.println("서버 접속 실패");
        }
    }
}
