package 입출력연습2;

import java.util.Scanner;

// 정수 n을 입력받아 n * n 크기의 행렬을 출력하는 프로그램 작성
// 값은 1부터 출력
// 입력 : 3
// 1 2 3
// 4 5 6
// 7 8 9

// Scanner 클래스 : 표준 입력 클래스, java.util 패키지에 있음
// 클래스이름 참조자이름(객체이름) = new 클래스이름(System.in)
public class InOutEx2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //sc는 객체를 참조하고 있는 변수 객체는 new 뒤에 scanner
//        System.out.print("정수를 입력 하세요 : ");
//        int n = sc.nextInt();
//        for(int i = 1; i <= n * n; i++) {
//            System.out.printf("%4d", i);
//            if (i % n == 0) System.out.println();
//        }
        Scanner sc = new Scanner(System.in); // 입력 받기 위한 객체 생성됨
//        byte a = sc.nextByte(); // -128 ~ 127
//        short b = sc.nextShort();
//        int c = sc.nextInt();
//        long d = sc.nextLong();
//        char ch = sc.next().charAt(0); // 문자열을 입력받아서 첫번째 문자를 추출.
//        float e = sc.nextFloat();
//        double f = sc.nextDouble();
//        boolean g = sc.nextBoolean();
//        String h = sc.next(); // 문자열을 입력받는데 공백이 오면 그만 입력받음(공백앞까지만)
//        String i = sc.nextLine(); // 줄바꿈(개행문자)가 오기전까지 입력받음
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next(); // 문자열을 입력받음(공백오면 중단 됨)
        sc.nextLine(); // 버퍼 비워주기 (입력받고 남은 쓰레기값을 비워준다. 연속으로 입력하다보면 생기는 현상 방지해줌)
        System.out.print("주소를 입력하세요 : ");
        String addr = sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0); // 문자열 중에서 0번째 인덱스의 값을 가져옴
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.print("회원정보를 출력하시겠습니까?[Yes/no] : ");
        String isPrint = sc.next();
        if(isPrint.equalsIgnoreCase("Yes")) { // 대소문자를 구분안하겠다.
            System.out.println("======== 회원정보 ========");
            System.out.println("이름 : " + name);
            System.out.println("주소 : " + addr);
            System.out.println("성별 : " + gender);
            System.out.println("나이 : " + age);
        } else {
            System.out.println("출력 안함");
        }

    }
}
