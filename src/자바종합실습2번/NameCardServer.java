package 자바종합실습2번;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

// 이름, 전화번호, 회사명, 이메일이 포함된 10개의 명함 정보 생성 후 다른 컴퓨터로 전송하기
// 접속된 클라이언트의 갯수에 상관없이 모든 클라이언트에 전송하기
public class NameCardServer {
    static List<NameCardS> list = new ArrayList<>(); // 객체를 저장할 어레이리스트 생성
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8990);
            while(true) {
                // 클라이언트의 connect 연결 요청에 대해 대기하는 중. Blocking 모드
                Socket socket = serverSocket.accept();
                System.out.println("[Client : " + socket.getRemoteSocketAddress() + " 연결!");
                Thread server = new ServerSocketTh(socket);
                server.start();
            }
        } catch (IOException e) {

        }
    }
    static List<NameCardS> createNameCard() {
        list.add(new NameCardS("안유진", "010-1234-5678", "지구오락실", "ayj@gmail.com"));
        list.add(new NameCardS("이영지", "010-2234-5678", "지구오락실", "lyj@gmail.com"));
        list.add(new NameCardS("이은지", "010-3234-5678", "지구오락실", "lej@gmail.com"));
        list.add(new NameCardS("미미", "010-4234-5678", "지구오락실", "mimi@gmail.com"));
        list.add(new NameCardS("우영우", "010-5234-5678", "이상한변호사", "wyw@gmail.com"));
        list.add(new NameCardS("이준호", "010-6234-5678", "이상한변호사", "ljh@gmail.com"));
        list.add(new NameCardS("정명석", "010-7234-5678", "이상한변호사", "jms@gmail.com"));
        list.add(new NameCardS("최수연", "010-8234-5678", "이상한변호사", "csy@gmail.com"));
        list.add(new NameCardS("임윤아", "010-9234-5678", "빅마우스", "lya@gmail.com"));
        list.add(new NameCardS("이종석", "010-0234-5678", "빅마우스", "ljs@gmail.com"));
        return list;
    }
}
