package X보다작은수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 배열의 개수와 기준값을 입력받음 10(배열의 개수) 5(기준값)
// 입력된 기준 수 보다 작은 수를 모두 출력
// 입력 : 10 5
// 배열의 값 : 1 2 3 4 5 6 7 8 9 10
// 결과 : 1 2 3 4
public class XArrayEx1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("배열의 개수와 기준값 입력 : ");
//        int n = sc.nextInt(); // 배열의 개수 입력
//        int x = sc.nextInt(); // 기준 값 입력
//        int[] arr = new int[n]; // n의 개수 만큼 배열 생성
//        // 반복문을 돌려서 배열에 값 입력 받고 x보다 작은 수 출력
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//            if(arr[i] < x) System.out.print(arr[i] + " ");
//        }
//        System.out.println();



        // 정수 N과 X가 주어지고 N개의 배열 생성 후 배열에서 X보다 작은 수 찾아서 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 개수와 기준값 입력 : ");
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int x = sc.nextInt();
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt()); // 리스트 입력 받은 값 추가
            if(list.get(i) < x) System.out.print(list.get(i) + " ");
        }
    }
}
