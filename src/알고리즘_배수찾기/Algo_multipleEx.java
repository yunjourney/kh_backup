package 알고리즘_배수찾기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 첫째줄에 n값 입력 받음 (n값이 3이라고 가정)
// 둘째줄부터 입력 받는 수가 n의 배수인지 확인하는 문제
// ex) 99 입력 : "99 is a multiple of 3."
// ex) 7 입력 : "7 is NOT a multiple of 3."
// 0 입력되면 종료
public class Algo_multipleEx {
    public static void main(String[] args) {
        // ArrayList 생성하기
        // 키보드 입력을 받기 위한 스캐너 생성
        // n값을 입력 받기
        // 무한의 횟수를 반복하는 반복문 만들기(탈출 조건 : 0 입력)
        // 반복문을 돌면서 계속 값을 입력받아 리스트에 담기(add)
        // 반복문이 끝나면 다시 반복문을 돌면서 배수인지 아닌지 확인해서 출력

        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int nm; // 키보드를 통해 값을 입력 받는 변수
        System.out.print("n값 입력 : ");
        int n = sc.nextInt();
        while(true) {
            nm = sc.nextInt(); // 위에 int 변수 밖에 빼놓고 while안에서 재사용하도록 절약
            if(nm == 0) break;
            list.add(nm);
            for(Integer e : list) {
                if (e % n == 0) System.out.print(e + " is a multiple of " + n + ".");
                else System.out.print(e + " is NOT a multiple of " + n + ".");
            }
        }
    }
}
