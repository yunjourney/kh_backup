package 배열;
import java.util.Arrays;
// 배열의 다양한 초기화 방법
// 다양한 데이터 타입에 대한 배열 선언
public class ArrayEx {
    public static void main(String[] args) {
////        int[] score = new int[3]; // score 이름으로 3개의 정수 타입 배열을 생성
////        score[0] = 88;
////        score[1] = 70;
////        score[2] = 99;
//        int[] score = {89, 99, 100, 77}; // score의 값이 아닌 score의 방을 알려줌. 크기를 지정해주지 않아도 알 수 있음(length = 4)
//        int sum = 0;
//        // 일반적 for문
////        for (int i = 0; i < score.length; i++) { // length 배열의 길이 알 수 있음. 0부터 배열의 길이보다 1 작을 때 까지 돈다
////            System.out.print(score[i] + " ");
////            sum += score[i]; // sum = sum + score[i]
////        }
//        // 향상된(Enhanced) for문 : 자동으로 요소의 처음부터 끝까지 순회(원하는 위치부터 순회불가)
////        for (int e : score) {  // e는 element, i 넣는거보다 덜 헷갈려서 쓰는 것뿐 / 배열 뿐 아니라 자료구조 형식이면 올 수 있음
////            // e += 100; // 원하는 값 넣어도 고정이 안 됨. 실제 배열값 변경x
////            System.out.print(e + " ");
////            sum += e;
////        }
//        // 향상된 for문을 1줄로 변경한 것
//        for (int e : score) sum += e;
//
//        System.out.println(Arrays.toString(score)); // 배열의 요소 알려줌
//        System.out.println("총점 : " + sum);
//        System.out.printf("평균 : %.2f\n", (double)sum/score.length);

        // 배열의 다양한 초기화 방법
//        int[] score1 = {88, 99, 56}; // 방법1) 배열의 초기값이 정해져 있는 경우는 new 키워드로 메모리를 할당할 필요가 없다. 자주 씀.
//        int[] score2 = new int[] {77, 79, 99}; // 방법2) new 키워드 사용은 되지만 굳이 안 씀.
//        int[] score3; // 방법3) 참조형 변수 선언, 거의 안 씀.
//        score3 = new int[] {44, 55, 77}; // 참조형 변수에 할당한 것
//        int[] score4 = new int[3]; // 방법4) 자주 씀.
//        score4[0] = 33;
//        score4[1] = 66;
//        score4[2] = 89;

        // 다양한 데이터 타입에 대한 배열 선언
//        int[] odds = {1,3,5,7,9,11};
//        String[] weeks = {"월요일", "화요일", "수요일", "목요일", "금요일"};
//        char[] test = {'A', 'B', 'C', 'E'}; // 문자일 때는 작은따옴표 사용
        String[] weeks = new String[7];
        weeks[0] = "월요일";
        weeks[1] = "화요일";
        weeks[2] = "수요일";
        weeks[3] = "목요일";
        weeks[4] = "금요일";
        weeks[5] = "토요일";
        weeks[6] = "일요일";
        // 출력 방법 1
        System.out.print("[");
        for(int i = 0; i < weeks.length; i++) {
            System.out.print(weeks[i] + ", ");
        }
        System.out.printf("\b\b]"); // ]로 닫기 전 마지막 값 뒤에 붙는 ','' ' 을 지워줌
        System.out.println();

        // 출력 방법 2 : 배열 클래스의 메소드를 이용한 출력
        System.out.println(Arrays.toString(weeks)); //

        // 출력 방법 3 : enhanced for문
        System.out.print("[");
        for(String e : weeks) System.out.print(e + ", ");
        System.out.printf("\b\b]");
        System.out.println();

    }
}
