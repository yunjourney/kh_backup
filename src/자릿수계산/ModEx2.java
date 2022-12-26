package 자릿수계산;

import java.util.Scanner;

// 100의 자리의 정수를 입력받아서 3개의 변수에 대입
// a는 100자리 수, b는 10자리 수, c는 1자리 수
// 입력 : 345 ==> a : 3, b : 4, c : 5
// 힌트는 몫과 나머지 연산을 활용
public class ModEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = num / 100; // num에 100이라는 값이 몇 번 들어가는 지 (몫을 구함)
        int b = (num % 100) / 10; // 345를 100으로 나눈 나머지 45에서 10을 나누면 4만 남음
        int c = num % 10; // 345를 10으로 나눈 나머지는 몫이 34 들어가고 5가 남음
        // 방법 1
        if (a > b) {
            if(a > c) System.out.println(a);
            else System.out.println(c);
        } else {
            if(b > c) System.out.println(b);
            else System.out.println(c);
        }
        // 방법 2
        if (a > b) {
            System.out.println(Math.max(a,c));
        } else {
            System.out.println(Math.max(b,c));
        }
        System.out.println("100의 자리 : " + a + ", 10의 자리 : " + b + ", 1의 자리 : " + c);
    }
}
