package 예외처리;

import java.io.FileWriter;
import java.io.IOException; // 하위에 있는 모든 에러들을 처리 (Exception이 최상위)
import java.util.Scanner;

// 예외처리 : 프로그램에서 예외 상황이 발생했을 경우 프로그램의 갑작스러운 종료를 막고
// 정상적인 동작을 유지하도록 만들어줌
// 파일 입출력에 대한 예외 처리
public class ExceptionMain {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수를 입력 하세요 : ");

//        int num = sc.nextInt();
//        try {
//            System.out.println(4/num);
//            System.out.println("여기는 안 올 것 같음....");
//        } catch (ArithmeticException e) {
//            System.out.println("나눗셈 에러 : " + e);
//        }
//        System.out.println("에러가 발생했지만 계속 진행함...");

//        int num = sc.nextInt();
//        int[] arr = {1,2,3,4,5};
//        try {
//            System.out.println(arr[num]);
//        } catch (ArrayIndexOutOfBoundsException e) { // e는 자바에서 제공하는 에러 문구
//            System.out.println("배열 에러 : " + e);
//        }

        FileWriter f = null; // 참조 변수에 초기값 대입
        try {
            f = new FileWriter("test.txt");
            f.write("Hello Java");
        } catch (IOException e) {
            e.printStackTrace(); // 디버깅용으로 사용하며 에러에 대한 Call Stack 저장
        // 어떤 예외가 발생하더라도 반드시 실행되어야 할 구문 있으면 finally에 적어 줌
        } finally {
            if (f != null) { // 중요!
                try {
                    f.close(); // 쓰기 위한 파일을 열고 난 다음 다 사용한 후 자원을 반납하고 진행
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
