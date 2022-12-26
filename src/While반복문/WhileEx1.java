package While반복문;

import java.util.Scanner;

public class WhileEx1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 입력 : ");
//        int n = sc.nextInt();
//        int sum = 0;
////     // while문 사용
////        while(true) { // 내부가 항상 참인 조건
////            System.out.print(n + " ");
////            sum += n; // sum = sum + n; sum값 0으로 초기값 지정해줘야 함.
////            n--;
////            if(n == 0) break;
////        }
//        // for문 사용(1)
//        for(int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        // for문 사용(2) = while문과 같은 구조
//        int i = 1;
//        for(;;) {
//            sum += i;
//            if (i == n) break;
//            i++;
//        }
//        System.out.println("합계 : " + sum);

//        // while문 - 탈출조건문 따로 만들어주기
//        int age; // 나이를 입력 받기 위한 변수
//        Scanner sc = new Scanner(System.in);
//        while(true) { // true 뿐아니라 조건식도 가능
//            System.out.print("나이를 입력하세요 : ");
//            age = sc.nextInt();
//            if(age > 0 && age < 200) break;
//            System.out.println("나이를 잘못 입력하셨습니다.");
//        }
//        // do ~ while문 - 조건이 어떻든 1번은 수행해본다
//        boolean isFirst = true; // 첫번째 진입인자
//        do {
//            if(!isFirst) // isFisrt == false
//                System.out.println("나이를 잘못 입력하셨습니다.");
//            System.out.print("나이를 입력하세요 : ");
//            age = sc.nextInt();
//            isFirst = false;
//        } while(age <= 0 || age >= 200); // 탈출 조건을 여기에 만들기

        // while문을 정해진 횟수만큼 돌림
        int treeHit = 0; // 초기값
        while(treeHit < 10) {
            treeHit++;
            System.out.println("나무를 " + treeHit + "번 찍었습니다.");
            if(treeHit == 10) { // 최종값
                System.out.println("나무가 넘어 갑니다.");
            }
        }

        // for문으로 바꾸면?
        for(int i = 1; i <= 10; i++) {
            System.out.println("나무를 " + i + "번 찍었습니다.");
        }
        System.out.println("나무가 넘어 갑니다.");
    }
}
