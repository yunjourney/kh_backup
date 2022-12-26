package 소수판별하기;

import java.util.Scanner;

// 주어진 정수가 소수인지 아닌지 판단하기
// 소수란? 1과 자기자신 이외의 수로는 나누어 지지 않는 수를 의미함
public class IsPrimeEx1 {
    public static void main(String[] args) {
        boolean isPrime = true; // 초기조건을 소수(Prime)라고 정의하고 시작함
        Scanner sc = new Scanner(System.in); // 입력을 받기 위한 스캐너 생성
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        // i의 범위가 n보다 작은 동안 수행하므로 자기 자신도 제외
        for(int i = 2; i < n; i++) { // i가 2부터 시작하므로 1은 제외
            System.out.println("테스트 : " + i);
            if(n % i == 0) isPrime = false; // 한번이라도 나눠진다면 false가 됨
        }
        // 방법 1
        if(isPrime) System.out.println("소수입니다.");
        else System.out.println("소수가 아닙니다.");
//        // 방법 2
//        if(!isPrime) { // isPrime == false
//            System.out.println("소수가 아닙니다.");
//        } else {
//            System.out.println("소수입니다.");
//        }


    }
}
