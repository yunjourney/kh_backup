package 문자열추가하기;

import java.util.Scanner;

// 2개의 문자열을 입력 받음, 정수 갯수만큼의 문자열을 첫번째 문자열의 뒤에서부터 자름
// 두번째 문자열 앞에 붙임
// 첫번째 : seoul
// 두번째 : korea
// 정수 : 2
// 결과 : ulkorea
public class StringEx2 {
    public static void main(String[] args) {
        // 문자열을 입력 받기 위한 스캐너 객체 생성
        // 첫번째와 두번째 문자열을 각각 입력 받음
        // 정수를 입력 받음
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열 : ");
        String firstStr = sc.next();
        System.out.print("두번째 문자열 : ");
        String secondStr = sc.next();
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        // 첫번째 입력 받은 문자열에서 n의 개수 만큼을 뒤에서부터 자름
        int pos = firstStr.length() - n; // 문자열 길이로부터 n의 개수만큼 이동한 위치를 찾음. 5-2 = 3, 인덱스 0 1 2 3에서 3번째 문자열시작
        String sub = firstStr.substring(pos); // firstStr에서 pos를 잘라서 넣는다.
        System.out.println(sub + secondStr);

    }
}
