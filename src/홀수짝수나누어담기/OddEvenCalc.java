package 홀수짝수나누어담기;

import java.util.Scanner;

// 7개의 정수를 입력받아 홀수와 짝수 배열에 나누어 담기
// 입력받는 inputInt()
// 홀수와 짝수를 계산하는 oddEven()
// 결과를 출력하는 dispOutput()
// 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6
public class OddEvenCalc {
    int[] arr = new int[7]; // 정수를 입력 받는 배열
    int[] even = new int[7]; // 입력 받은 배열에서 짝수만 담는 배열
    int[] odd = new int[7]; // 입력 받은 배열에서 홀수만 담는 배열
    int eIdx = 0;
    int oIdx = 0;
    public void inputInt() {
        // 사용자로 부터 7개의 정수를 입력 받아 배열에 저장
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void oddEven() {
        // arr 배열에 저장된 값 중에서 홀수는 odd, 짝수는 even에 나누어 담기
        for (int i = 0; i < 7; i++) { // (int e : arr)
            if (arr[i] % 2 == 0) even[eIdx++] = arr[i]; // 배열의 값이 짝수면 인덱스의 0번째에 값을 넣고 ++해야 다음 칸에 넣어진다
            else odd[oIdx++] = arr[i]; // 홀수면 넣고
        }
    }
    public void dispOutput() {
        // 홀수 배열과 짝수 배열 결과 출력
        System.out.print("홀수 : ");
        for (int i = 0; i < oIdx; i++) System.out.print(odd[i] + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for (int i = 0; i < eIdx; i++) System.out.print(even[i] + " ");
        System.out.println();
    }
}
