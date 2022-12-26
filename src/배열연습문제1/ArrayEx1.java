package 배열연습문제1;

import java.util.Scanner;

// 10개의 정수 배열 생성, 값이 중복 됨 (1,2,3,4,5,1,2,3,4,5)
// 이 중에서 찾을 값 입력 : 2 ==> 결과는 7이 나와야 함
// 해당 값의 위치(인덱스(0이니까)+1값)를 반환하고 찾는 두번째 값이 없으면 -1을 반환
public class ArrayEx1 {
    public static void main(String[] args) {
        // 정수형 배열 선언
        // 찾을 값을 입력받기 위한 변수 생성 및 스캐너 객체 생성
        // 반복문을 순회하면서 해당값의 위치를 찾음 (첫번째 찾은 값이 아닌 두번째 위치를 찾아야 됨)
        int cnt = 0; // 찾을 값이 몇 번 나타났는지 확인하기 위한 변수
        int[] arr = {1,2,3,4,5,1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 값 입력 : ");
        int a = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == a) {
                cnt++;
                if(cnt == 2) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
        if(cnt < 2) System.out.println("-1");
    }
}

