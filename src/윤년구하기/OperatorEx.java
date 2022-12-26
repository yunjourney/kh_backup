package 윤년구하기;

import java.util.Scanner;

// 윤년이란 ? 지구가 태양을 한 바퀴 도는데 걸리는 시간이 365일과 4/1이 더 필요함
// 연도가 4로 나누어 떨어진다. (4의 배수)
// 100으로 나누어 떨어지는 연도는 윤년이 아니다.
// 400으로 나누어 떨어지면 윤년이다.
public class OperatorEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력 하세요 : ");
        int year = sc.nextInt();
        if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}
