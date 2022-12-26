package 배열연습문제2;
// 5명의 성적을 정수로 입력 받음(성적은 5의 배수이며 0~100사이)
// 성적이 40점 이하인 경우 보충학습을 듣는 조건으로 40점으로 조정
// 5명 학생의 평균 점수 구하기
import java.util.Scanner;
public class ArrayEx2 {
    public static void main(String[] args) {
        // 5명의 성적을 입력 받기 위한 배열 선언
        // 총점을 누적하기 위한 변수 선언
        // 선언된 배열에 5명의 성적을 받기 위해서 스캐너 생성
        // 반복문을 통해 5명의 성적을 배열에 입력 받음
        // 입력 받은 배열에서 40보다 작은 요소 값을 찾아서 40으로 변경 해줌
        // 변경된 성적으로 총점을 구하고 학생 수로 나누어 평균을 구함
        int[] score = new int[5];
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("성적 입력 : ");
        for (int i = 0; i < score.length; i++) {
            // 5명의 성적을 입력 받아서 배열에 넣어줌
            score[i] = sc.nextInt();
            // 성적이 40점 이하인 경우 40으로 조정
            if (score[i] < 40) score[i] = 40;
            // score[0 ~ 4]까지의 성적을 total에 누적
            total += score[i];
        }
        // 총점으로 평균을 계산해줌
        System.out.println(total/score.length);


    }
}
