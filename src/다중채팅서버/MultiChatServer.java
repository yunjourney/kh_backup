package 다중채팅서버;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiChatServer {
    public static void main(String[] args) {
        int port = 8900;
        try {
            // port 번호만 넣으면 서버의 첫번째 ip가 자동 입력됨
            // 바인딩(서버와 ip의 포트번호를 매핑 시키는 것) 과정 생략
            ServerSocket serverSocket = new ServerSocket(port);
            while(true) {
                // 하나의 session, 즉 한 개의 연결 통로가 만들어짐
                Socket socket = serverSocket.accept();
                Thread serverTh = new ServerSocketTh(socket);
                serverTh.start();

            }

        } catch(IOException e) {}
    }
}
