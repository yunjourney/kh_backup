package 알고리즘_요금제;
import java.util.Scanner;

// 영식(Y) 요금제 : 30초당 10원 (30초가 되면 2통이 됨)
// 민식(M) 요금제 : 60초당 15원 (60초가 되면 2통이 됨)
// 입력 : 통화 횟수가 첫째줄에 입력되고 통화 횟수에 대한 시간이 각각 입력됨
// 만약 총 요금이 같은 경우 Y M 통화 요금
// 3 (통화 횟수) : 총 통화 횟수는 20을 넘지 않는다.
// 40 40 40 (통화 시간)
// M 45 (요금제 및 요금)
public class PriceCalcEx {
    public static void main(String[] args) {
        // 통화 횟수에 대한 배열을 만듦 (20개)
        // 스캐너를 만들어 통화 횟수 입력 받음
        // 반복문을 돌면서 통화 횟수에 대한 통화 시간을 배열에 넣음
        // 통화횟수만큼 반복문을 돌면서 요금을 계산해서 누적함
        // 영식 요금제와 민식 요금제를 비교해서 싼 요금제를 출력함
        // 같으면 Y M 으로 출력
        int[] call = new int[20];
        int yTel = 0, mTel = 0; // 영식과 민식 요금제를 구하기위한 변수
        Scanner sc = new Scanner(System.in);
        System.out.print("통화 횟수 : ");
        int n = sc.nextInt();
        System.out.print("통화 시간 : ");
        for(int i = 0; i < n; i++) {
            call[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            yTel += (call[i] / 30) * 10 + 10; // 기본 1통화 + (30초당 1통) 30보다 작으면 0 크면 1. 하면서 누적
            mTel += (call[i] / 60) * 15 + 15;
        }
        if (yTel > mTel) {
            System.out.println("Y " + yTel);
        } else if (yTel < mTel) {
            System.out.println("M " + mTel);
        } else {
            System.out.println("Y M " + yTel);
        }
    }
}
