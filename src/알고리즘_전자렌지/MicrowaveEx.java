package 알고리즘_전자렌지;
import java.util.Scanner;
// 3개의 타이머 : a 5분(300), b 1분(60), c 10초
// 정확한 시간을 맞출 수 없으면 -1 (즉, 10보다 작은 수)
public class MicrowaveEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, a, b, c; // t는 요리시간 입력 받기 위한 변수
        System.out.print("요리시간(초) : ");
        t = sc.nextInt();
        if(t % 10 != 0) System.out.println("-1");
        else {
            a = t / 300; // 300으로 나눈 몫
            b = t % 300 / 60; // 300으로 나눈 나머지(300보다 작은 값)에서 60으로 나눈 몫
            c = t % 300 % 60 / 10; // 300으로 나눈 나머지에서 다시 60으로 나누고 남은 값을 10으로 나눔. a,b버튼 제외하도록
            System.out.printf("%d %d %d\n", a, b, c); // 출력 방법 1
            System.out.printf(a + " " + b + " " + c); // 출력 방법 2
        }
    }
}
