package 알고리즘_저항;
// 3개의 컬러값을 입력 받음
// 첫번째 입력 10의 자리
// 두번째 입력 1의 자리
// 세번째 곱하기 값
import java.util.Scanner;

public class AlgoEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color1 = sc.nextLine();
        String color2 = sc.nextLine();
        String color3 = sc.nextLine();
        // 컬러값에 대한 문자열 배열 선언
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] db = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
        int val1 = 0, val2 = 0, val3 = 0;
        for(int i = 1; i < 10; i++) {
            if(color1.equals(color[i])) val1 = i; // 입력값과 배열의 문자열끼리 비교
            if(color2.equals(color[i])) val2 = i;
            if(color3.equals(color[i])) val3 = db[i];
        }
        System.out.println((long)(val1 * 10 + val2) * val3);
        // white를 넣으면 10억으로 int보다 넘어가서 long 형 변환 필요함. 10의 자리 + 1의 자리 * 곱하기값
    }
}
