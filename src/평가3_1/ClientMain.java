package 평가3_1;
// 문제 해결 시나리오
// 1. 클라이언트용 프로그램 작성 했으나 서버에 연결 되지 않음. 이유를 찾아서 기술
// 2. IO를 이용하여 기존 파일에 데이터를 이어쓸 수 있도록 구현

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ClientMain {
    public static void main(String[] args) {

        // 문제 1
        int port = 3000;
        String serverIP; // String serverIP = "192.111.11.11"; 이렇게 되어야함.
        try {
            serverIP = InetAddress.getLocalHost().getHostAddress(); // 서버IP가 아닌 자신의 IP를 가져옴.getLocalHost는 자기 자신 PC. IP Address 이므로 틀림
            // Socket socket = new Socket("서버에 대한 IP", "서버에서 지정한 port 번호"); // 연결할려는 서버에 대해 넣어야 한다

            System.out.println(serverIP); // 자기 PC의 IP 주소 나옴
            Socket socket = new Socket(serverIP, port);
        } catch (IOException e) {}


        // 문제 2
        FileWriter fw = null; // 문자 기반 스트림으로 텍스트 데이터를 파일에 저장할 때 사용
        try {
            fw = new FileWriter("src/평가3_1/test.txt", true); // [정답] true 옵션 추가 해야 함. (append = 이어쓰기)
            fw.write(97); // ASCII : a
            fw.write(65); // ASCII : A
            fw.close(); // [정답] 파일 출력 이후는 반드시 close()해줘야 함.

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
