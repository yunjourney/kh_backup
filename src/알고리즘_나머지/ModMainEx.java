package 알고리즘_나머지;
import java.util.Scanner;

// 10개의 수를 입력 받음
// 입력 받은 수를 42로 나눈 나머지 중 다른게 몇 개 인지 출력
// 입력값 : 42 84 252 420 840 126 42 84 420 126
// 출력 : 1
// 입력값 : 39 40 41 42 43 44 82 83 84 85
// 출력 : 6
public class ModMainEx {
    public static void main(String[] args) {
        // 10개의 임의의 수를 입력받기 위한 스캐너 생성
        // 42로 나눈 나머지는 0 ~ 42이기 때문에 42의 정수 배열 만들기
        // 임의의 10개 정수를 입력받기 위해 반복문 만들기
        // 반복문을 돌면서 임의의 정수값을 입력 받고 42로 나눈 배열에 1을 넣음
        // 42개로 만들어진 배열을 순회하면서 값을 더해줌
        // 결과 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("10개의 수 입력 : ");
        int[] arr = new int[42];
        int cnt = 0; // 중복된 개수를 누적하기 위한 변수
        int x;  // 임의의 정수값을 입력 받기 위한 변수
        for (int i = 0; i < 10; i++) {
            x = sc.nextInt(); // 임의의 정수값을 입력 받음
            arr[x % 42] = 1; // 나눈 나머지를 배열의 인덱스로 변환해서 1을 넣어줌
        }
        for (int i = 0; i < arr.length; i++) {
            cnt += arr[i]; // 1인 값이 다 더해짐
        }
        System.out.println(cnt);
    }
}
