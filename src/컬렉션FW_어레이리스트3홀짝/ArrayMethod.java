package 컬렉션FW_어레이리스트3홀짝;
// 1. 정수를 입력 받음 (999가 들어오면 입력 중지)
// 2. ArrayList에 홀수/짝수를 나누어 담기
// 3. 홀수/짝수 ArrayList 출력하기

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayMethod {
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();
    // 정수값 입력받는 메소드
    void inputValue() {
        int tmp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        while(true) {
            tmp = sc.nextInt();
            if(tmp == 999) break;
            inList.add(tmp);
        }
    }
    void calcMethod() {
        for(Integer e : inList) { // int도 가능하나 의미상 Integer 넣음
            if(e % 2 == 0) evenList.add(e);
            else oddList.add(e);
        }
    }
    void printMethod() {
        System.out.println("홀수 : ");
        for(Integer e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.println("짝수 : ");
        for(Integer e : evenList) System.out.print(e + " ");
        System.out.println();
    }
}

