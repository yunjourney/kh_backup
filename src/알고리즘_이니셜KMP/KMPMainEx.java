package 알고리즘_이니셜KMP;
// "Knuth-Morris-Pratt" 형태로 첫 글자는 항상 대문자,
// 그리고 성과 성 사이는 '-'으로 이루어짐
// 결과는 성의 첫 글자인 대문자만 표시
// 입력은 한 줄로 이루어져있고 100글자 이내의 영어 대/소문자로 이루어짐
import java.util.Scanner;

public class KMPMainEx {
    public static void main(String[] args) {
        // 문자열 입력을 받기 위한 스캐너 객체 생성
        // 문자열 입력에 대한 가이드 문구 출력
        // 문자열 입력 받기
        // 입력 받은 문자열 길이 만큼 반복문 수행
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String name = sc.next();

        // 방법1. charAt(인덱스)로 문자의 ASCII 확인 후 'A' ~ 'Z' 사이 문자만 출력
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
                System.out.print(name.charAt(i));
            }
        }

        // 방법2. 0번째 문자 출력, 그리고 '-' 다음의 문자 출력
        for (int i = 0; i < name.length(); i++) {
            if(i == 0) System.out.print(name.charAt(i));
            else {
                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
            }
        }

        // 방법3. split() 메소드로 자르고 각자 0번째 인덱스
        String[] splitName = name.split("-"); // - 기준으로 문자열 잘라줌
        for (String e : splitName) {
            System.out.print(e.charAt(0));
        }

        // 방법4. 배열로 변경 후 'A' ~ 'Z' 사이 문자만 출력
        char[] chName = name.toCharArray();
        for(int i = 0; i < chName.length; i++) {
            if(chName[i] >= 'A' && chName[i] <= 'Z') {
                System.out.print(name.charAt(i));
            }
        }
        // 방법4의 향상된 for문
//        for(char e : chName) {
//            if(e >= 'A' && e <= 'Z') System.out.print(e);
//        }
    }
}
