package 자바종합실습3번;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ImageServerTh extends Thread {
    Socket socket;
    String path; // 파일의 경로 및 파일명
    ArrayList<Socket> sockets = new ArrayList<>();
    public ImageServerTh(Socket socket, String path) {
        this.socket = socket;
        this.path = path;
        sockets.add(socket);
    }
    @Override
    public void run() {
        int len;
        byte[] buffer = new byte[1024];
        try {
            for(int i = 0; i < sockets.size(); i++) {
                FileInputStream fis = new FileInputStream(path);
                OutputStream out = sockets.get(i).getOutputStream();
                while ((len = fis.read(buffer)) != -1) { // 버퍼 크기는 한 번에 입력받는 양을 결정하는 것
                    out.write(buffer, 0, len); // 0부터 1024만큼 계속 읽어서 sockets outputstream에 읽는다.
                }
                out.flush();
                out.close();
                System.out.println(sockets.get(i).getRemoteSocketAddress() + "에게 전송 완료");
            }

        } catch (IOException e) {

        }
    }
}
