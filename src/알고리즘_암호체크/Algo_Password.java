package 알고리즘_암호체크;
// 길이는 10에서 30사이(10 <= len() <= 30)
// 숫자, 대문자, 소문자 포함
// 특수문자 [ ! % _ # & + - * / ] 9개 중 1개 포함되어야 함.
// 위의 조건을 모두 만족하면 "Good password!"
// 만족하지 않으면 "Bad password!"
// 사용자가 "quit" 또는 "QUIT"를 입력하면 종료
import java.util.Scanner;
// 길이체크하는 메소드 - t/f
// 다음에 숫자만 포함된 메소드 t/f
// 대소문자 t/f...
// 특문 하나씩 비교해보고 있으면 true
// 4개의 메소드 모두 &&로 true -> good pw

public class Algo_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사용자가 입력한 패스워드를 저장하기 위한 변수
        String pw;
        // 암호 체크를 위한 클래스에 대한 객체 생성, 생성자는 기본 생성자
        CheckPWClass checkPW = new CheckPWClass();
        while(true) { // 무한 반복, 사용자가 quit 입력하기 전까지
            pw = sc.next(); // 키보드를 통해서 패스워드 입력받음
            // 입력받은 패스워드가 종료(quit)이면 반복문 종료함
            // equalsIgnoreCase() : 대소문자 구분안함
            if(pw.equalsIgnoreCase("QUIT")) break;
            // 패스워드 체크를 위해 입력받은 문자열을 매개변수로 전달하면서 inputPW() 메소드 호출
            if(checkPW.inputPW(pw)) {
                System.out.println("Good Password!");
            } else {
                System.out.println("Bad Password!");
            }
        }
    }
}
