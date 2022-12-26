package 배열클래스;
// Arrays 클래스 : 배열을 다루기 위한 다양한 메소드를 포함하고 있음
// java.util 패키지 소속
// 배열의 갯수를 입력받기
// 배열의 갯수만큼 임의의 수를 생성하기
// 찾을 수를 입력 받음

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayMainEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 개수 입력 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = (int)(Math.random() * num) + 1; // *num하면 num미만의 숫자만 생김, +1해서 1~
        }
        // Arrays.toString() : 배열의 요소를 문자열로 반환
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr); // 오름차순 정렬
        System.out.println(Arrays.toString(arr));
        System.out.print("찾을 수를 입력 : ");
        int findNum = sc.nextInt();
        // binarySearch() : 이분 검색 가능
        int result = Arrays.binarySearch(arr, findNum);
        if(result >= 0) System.out.println(result);
        else System.out.println("찾는 수가 없습니다.");

        // asList() : 일반 배열을 List 타입으로 변환 (컬렉션 프레임워크 때 사용)
        List<int[]> list = Arrays.asList();
    }
}
