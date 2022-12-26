package 단일채팅서버;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class SendThread extends Thread {
    private final Socket socket;
    private Scanner sc = new Scanner(System.in);

    public SendThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            // 기본 데이터 타입으로 출력이 가능
            DataOutputStream sendWriter = new DataOutputStream(socket.getOutputStream());
            String sendString;
            while(true) {
                System.out.print("> ");
                sendString = sc.nextLine(); // 키보드로 부터 문자열을 입력 받음
                // UTF-8 인코딩을 사용해서 문자열을 출력
                try {
                    sendWriter.writeUTF(sendString); // 소켓 출력으로 문자열을 write
                    sendWriter.flush(); // 문자열 전송 이후 버퍼를 비움
                } catch(SocketException e) {
                    System.out.println("소켓 연결이 종료 되었습니다.");
                    if(socket != null) {
                        socket.close();
                    }
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}