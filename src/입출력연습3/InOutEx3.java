package 입출력연습3;

import java.io.IOException;

public class InOutEx3 {
    public static void main(String[] args) throws IOException {
        while(true) { // 항상 참인 상태
            int keyCode = System.in.read(); // 아스키코드로 읽어줌
            System.out.println("Code : " + keyCode);
            if(keyCode == 'q') break;
        }
    }
}
