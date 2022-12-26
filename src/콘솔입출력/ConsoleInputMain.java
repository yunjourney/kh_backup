package 콘솔입출력;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 키보드 입력을 받고 화면에 출력하는 것
// System.in, System.out, System.err
// System.in 필드 : 콘솔로부터 데이터를 입력받는 정적 필드, InputStream 과 사용가능
// System.out 필드 : 콘솔로 데이터를 출력하기 위해 사용
// 하지만 .. 스캐너 객체 사용이 더 낫다
public class ConsoleInputMain {
    public static void main(String[] args) throws IOException {

        // [System.in 필드 예제]
//        System.out.println("=== 메뉴 ===");
//        System.out.println("1. 예금 조회");
//        System.out.println("2. 예금 출금");
//        System.out.println("3. 예금 입금");
//        System.out.println("4. 죵료 하기");
//        InputStream is = System.in;
//        char inputChar = (char)is.read(); // ASCII 코드를 읽어 문자로 반환
//        switch (inputChar) {
//            case '1' :
//                System.out.println("예금 조회를 선택하셨습니다.");
//                break;
//            case '2' :
//                System.out.println("예금 출금을 선택하셨습니다.");
//                break;
//            case '3' :
//                System.out.println("예금 입금을 선택하셨습니다.");
//                break;
//            case '4' :
//                System.out.println("종료 하기를 선택하셨습니다.");
//                break;
//        }

        // [System.out 필드 예제] 방법일 뿐 잘 쓰진 않음
        OutputStream os = System.out;
        for(byte b = 48; b < 58; b++) { // 아스키코드 0123456789
            os.write(b);
        }
        os.write(10); // 개행문자 enter = 10

        for(byte b = 97; b < 123; b++) { // 아스키코드 영소문자
            os.write(b);
        }
        os.write(10); // abcdefghijklmnopqrstuvwxyz

        String hangul = "가나다라마바사아자차카타파하";
        // getBytes() : 유니코드를 바이트코드로 인코딩해주는 메소드
        byte[] hangulBytes = hangul.getBytes();
        os.write(hangulBytes); // 가나다라마바사아자차카타파하
        os.flush();
    }
}
