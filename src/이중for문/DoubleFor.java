package 이중for문;
import java.util.Scanner;

// 예제 1-3) 정수 n을 입력 받아서 별 찍기
// *
// * *
// * * *
// * * * *
// 예제 2-2) 입력 받은 수가 소수인지 아닌지 판별하기
// 소수란? 1과 자기자신 이외의 수로는 나누어 지지 않는 수를 의미함
// 결과 : n은 소수 입니다. n은 소수가 아닙니다.
// 추가예제 2-2) n의 수를 입력 받아서 범위 내의 소수의 합을 구하기 : 12미만 (2 + 3 + 5 + 7 + 11)
public class DoubleFor {
    public static void main(String[] args) {
//        // 예제 1-1 별찍기 기본
//        for(int i = 0; i < 10; i++) {
//            System.out.printf("|i = %d|", i);
//            for(int j = 0; j <10; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        // 예제 1-2 구구단
//        for(int i = 2; i < 10; i++) { // 각 단
//            for(int j = 1; j < 10; j++) { // 단 안에 있는 1~9
//                System.out.printf("%d x %d = %d\n", i, j, (i*j));
//            }
//            System.out.println("--------------------");
//        }

//        // 예제 1-3 별찍기 응용
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 입력 : ");
//        int n = sc.nextInt();
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < i+1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        // 예제 2-1 while문 활용한 주사위 난수 발생기
//        int num1, num2;
//        while(true) {
//            num1 = (int)((Math.random() * 6)) + 1; // 0~5까지 double형 난수 발생기. +1했으니 1~6까지 난수 발생됨
//            num2 = (int)((Math.random() * 6)) + 1;
//            System.out.println("주사위의 합 : " + (num1 + num2));
//            if((num1 + num2) == 12) break;
//        }

//        // 예제 2-2 소수 판별하기 [소수판별하기-IsPrimeEx1]
//        Scanner sc = new Scanner(System.in);
//        boolean isPrime = true;
//        System.out.print("정수 입력 : ");
//        int n = sc.nextInt();
//        for(int i = 2; i < n; i++) {
//            if (n % i == 0)
//                isPrime = false;
//            }
//            if(isPrime)
//                System.out.println(n + "은 소수입니다.");
//            else
//                System.out.println(n + "은 소수가 아닙니다.");
//

//        // 예제 2-2 심화 (미완성)
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        System.out.print("정수 입력 : ");
//        int n = sc.nextInt();
//        static int funcPrime(int n) {
//        boolean isPrime = true;
//            for(int i = 2; i < n; i++) {
//                if(n % 1 == 0) isPrime = false;
//            }
//        }
//        if() return n;
//        else return
    }
}
