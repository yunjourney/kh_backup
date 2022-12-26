package 문자열더하기;

import java.util.Scanner;

// n개의 숫자가 공백없이 입력됩니다. (12345)
// 출력 : 15
// str.length(), str.charAt(인덱스), ASCII(?)
// sum += charAt(i) - '0';
public class StringSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        String str = sc.next();
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0'; // char가 정수값이 아스키코드 '0' = 48
        }
        System.out.println(sum);

    }
}
