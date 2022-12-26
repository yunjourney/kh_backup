package 데이터와변수;
// 각 데이터형에 대한 변수 선언
// 변수의 사용 범위 : 지역변수는 중괄호{} 내에서 생존한다.
// []대괄호:배열을 의미, {}중괄호:메소드나 클래스 범위지정, ()소괄호:메소드의 매개변수 목록을 넣는 부분
// 상수 : 값이 한번 정해지면 변경이 불가능한 변수를 의미 (final)
// 타입 변환 : 하나의 타입을 다른 타입으로 변환하는 것
// 정수형을 문자형으로 변경하는 것, 실수와 정수 사이의 형변환
// 명시적 형변환은 개발자가 의도를 가지고 형을 변경하는 것
// 묵시적 형변환은 컴파일러가 유리한 방향으로 자동으로 형 변경

import java.util.Scanner;

public class DataValMain {
    public static void main(String[] args) {
        // camel 표기법 : taxRate (java의 기본. 낙타의 등 모양처럼 생김. 변수이름 소문자로 시작, 두번째 단어 대문자)
        // snake 표기법 : tax_rate (Python에서 사용)
        // pascal 표기법 : TaxRate (비추. 클래스이름과 대문자로 시작하니 겹칠 수 있다.)

//    boolean flag = false; // true와 false만 올 수 있음
//    char grade = 'A'; // 반드시 작은 따옴표를 사용(큰 따옴표는 문자열(String)로 인식)
//    byte value = 127; // -128 ~ 127
//    short sVal = 32000; // -32768 ~ 32767
//    int num = 125000;
//    long price = 200;
//    float tax = 3.33f; // double이 디폴트므로 명시적으로 f(float)붙여줘야 인식
//    double score = 3.33;
//
//    System.out.println(flag);
//    System.out.println(grade);
//    System.out.println(sVal);
//    System.out.println(num);
//    System.out.println(price);
//    System.out.println(tax + price);
//    System.out.println(score + price);

//    int x = 10;
//    System.out.println(x);

//    final int age = 30; // 초기값으로 age에 0 지정, final 지정시 한 번 쓴(write) 뒤에는 read only 상태
//    Scanner sc = new Scanner(System.in);
//    System.out.print("나이를 입력하세요 : ");
//    age = sc.nextInt(); // 스캐너로부터 정수를 입력 받아서 age 변수에 대입
//    age = age + 1000;
//    System.out.println("당신의 나이는 " + age + "입니다.");

//    final double taxRate = 0.10; // 세율을 의미
//    Scanner sc = new Scanner(System.in);
//    System.out.print("당신의 수입을 입력 하세요 : ");
//    int income = sc.nextInt();
//    System.out.printf("당신이 내야 할 세금은 %.2f\n", income * taxRate);

//        int kor, eng, mat;
//        int total;
//        double aver; //평균을 저장할 변수
//        Scanner sc = new Scanner(System.in);
//        System.out.print("국어 성적 입력 : ");
//        kor = sc.nextInt();
//        System.out.print("영어 성적 입력 : ");
//        eng = sc.nextInt();
//        System.out.print("수학 성적 입력 : ");
//        mat = sc.nextInt();
//        total = kor + eng + mat;
//        aver = (double)total/3; //double을 붙인건 명시적 형변환 /3은 묵시적 형변환 : 연산이 가능한 숫자끼리만
//        System.out.println("평균 : " + aver);
//
//        // 문자열을 정수 타입으로 변환하는 메소드(메소드를 이용한 형변환)
//        String strX = "100";
//        int x = Integer.parseInt(strX);
//        System.out.printf("x : %d\n", x);
//
//        String strY = "100.33";
//        double dY = Double.parseDouble(strY);
//        System.out.printf("y : %.2f\n", dY);

        // 진수에 대한 표현
        int var1 = 0b1010; // 2진수 0b를 붙이면 2진수로 간주
        int var2 = 0206;   // 8진수 앞에 0을 붙이면 8진법
        int var3 = 365;    // 10진수 0~9
        int var4 = 0xB3;   // 16진수 기계 사람 모두 만족하는 진법
        System.out.println("val1 : " + var1);
        System.out.println("val2 : " + var2);
        System.out.println("val3 : " + var3);
        System.out.println("val4 : " + var4);

    }

}
