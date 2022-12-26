package 산술연산자;
// 산술연산자 : 사칙연산과 나머지 연산
// 대입연산자 : 변수에 값을 대입하는 이항 연산자, 결합 방향은 오른쪽에서 왼쪽
// 증감연산자 : 단항연산자, 1씩 증가 또는 감소 시킬 때 사용함. (전위와 후위 관계가 중요)
// 비교연산자 : >, <, >=, <=, !=, ==
// 논리연산자 : &&(AND 연산 : 둘다 참인 경우 참), ||(OR 연산 : 둘 중 하나만 참인 경우 참), !(NOT 연산 : 현재의 조건을 부정함. 참->거짓, 거짓->참)
// 삼항연산자 : 3개의 피연산자를 가짐.(조건문의 if ~ else 구문을 대체함-2순위)
public class OperatorEx1 {
    public static void main(String[] args) {
//        int num1 = 10, num2 = 0;
//        System.out.println("덧셈 연산자 : " + (num1 + num2));
//        System.out.println("뺄셈 연산자 : " + (num1 - num2));
//        System.out.println("곱셈 연산자 : " + (num1 * num2));
//        try {
//            System.out.println("몫 연산자 : " + (num1 / num2));
//            System.out.println("나눗셈 연산자 : " + ((double) num1 / num2));
//            System.out.println("나머지 연산자 : " + (num1 % num2));
//        } catch(ArithmeticException e) {
//            System.out.println("0으로 나누면 안됩니다.");
//        }
//        int x = 5;
//        int y = 5;
//        int z = 5;
//        System.out.printf("결과 값 : %d\n", x + y + z);
//        System.out.printf("결과 값 : %d\n", x * y + z);
//        System.out.printf("결과 값 : %d\n", x * (y + z));
//
//        int num = 10; // 대입연산자
////        System.out.println(num += 2); // num = num + 2 복합대입연산자 (num=10이라는 초기값)
////        System.out.println(num -= 2); // num = num - 2 (바로 앞 출력식 때문에 여기서 num=12)
////        System.out.println(num *= 2); // num = num * 2
////        System.out.println(num /= 2); // num = num + 2
//
//        int tmp;
//        tmp = 10 * ++num + 10;
//        System.out.println(tmp);
//        System.out.println(num);

//        int x = 10;
//        int y = 20;
////        System.out.println(x > y); // false
////        System.out.println(x < y); // true
////        System.out.println(x >= y); // false
////        System.out.println(x <= y); // true
////        System.out.println(x != y); // 같지 않지? true
////        System.out.println(x == y); // false
//
//        boolean rst1, rst2, rst3;
//        rst1 = (x > 0) && (x > y); // false 비교연산자가 논리연산자보다 우선순위 높아서 괄호제거해도 실행은 되지만 보기에 헷갈림
//        rst2 = (x > 0) || (x > y); // true
//        rst3 = !((x > 0) || (x > y)); // false
//        System.out.println(rst1);
//        System.out.println(rst2);
//        System.out.println(rst3);

//        int score = 95;
//        char grade = (score > 90) ? 'A' : 'B';
////        char grade;
////        if (score > 90) {
////            grade = 'A';
////        } else {
////            grade = 'B';
////        }
//        System.out.println("당신의 학점은 " + grade);

        boolean isON = true;
        String strONOFF = (isON) ? "ON" : "OFF";
        System.out.println("전원 : " + strONOFF);
    }
}
