package 알고리즘_집주소;
import java.util.Scanner;

// 반복문을 돌면서 정수를 입력 받는다
// 번호 간판 제작 시 몇 칸이 필요한 가?
// 1은 2칸, 0은 4칸, 나머지 모든 수는 3칸
// 각 숫자 사이는 1칸의 여백이 필요. 처음과 마지막에 1칸 여백
// 0이 입력되면 반복문 종료
// 120
// 5611
// 100
// 0
// ------
// 13
// 15
// 14
public class AddrMain {
    public static void main(String[] args) {
        // 각 숫자마다 몇 자리의 공간을 차지하는지에 대한 배열 생성
        int[] numberSize = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        // 전체 공간을 누적하기 위한 변수 선언 및 초기화
        int sum = 0;
        String inputNumber; // 간판의 숫자를 입력받기 위한 변수
        // 간판의 숫자를 입력받기 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        while (true) {
            // 간판의 숫자를 문자로 입력 받음
            inputNumber = sc.nextLine();
            if (inputNumber.equals("0")) break;
            for (int i = 0; i < inputNumber.length(); i++) {
                sum += numberSize[inputNumber.charAt(i) - '0'] + 1; // 각각의 문자에 대한 인덱스 - 아스키코드'0'
            }
            System.out.println(sum + 1);
            sum = 0;
        }
    }
}

