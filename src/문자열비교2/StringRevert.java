package 문자열비교2;

import java.util.Scanner;

// 문자열 반전
// 문자열을 입력으로 사용
// 입력 문자열을 반전하여 출력합니다.
// 힌트 : for문을 사용하며 초기값은 배열의 크기보다 1 작게(인덱스범위의 마지막)
// 종료값은 0이 될 때까지
// 문자열 길이를 확인하는 방법 : str.length()
// 문자열에서 한 개의 문자를 비교하는 방법은 str.charAt(인덱스)
public class StringRevert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String a = sc.next();
        for(int i = a.length()-1; i >= 0; i--) { // [for문 반전] 길이-1해야 마지막 인덱스가 나온다
            System.out.print(a.charAt(i));
        }
        System.out.println();
    }
}
