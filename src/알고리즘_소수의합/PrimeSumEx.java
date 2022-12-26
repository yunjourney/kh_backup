package 알고리즘_소수의합;
import java.util.Scanner;
// 12 : 2 + 3 + 0 + 5 + 0 + 7 + 0 + 0 + 0 + 11 = 28
// 입력 받은 정수보다 작은 소수의 합을 구하는 문제
// 메소드를 이용해서 처리
public class PrimeSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; // n보다 작은 소수의 합을 구하기 위한 변수
        int n = sc.nextInt(); // n보다 작은 소수의 합을 구하기 위해 정수 입력 받음
        for (int i = 2; i < n; i++) { // 1과 자기 자신은 제외하기 위한 반복문 범위
            sum += primeFunc(i); // 해당 인덱스가 소수인지 확인
        }
        System.out.println(sum);
    }
    // PrimeSumEx 클래스를 객체로 생성하지 않고 사용하기 위해 static 처리
    // 매개변수를 정수로 입력받아 정수 값을 반환하는 메소드
    static int primeFunc(int n) {
        boolean isPrime = true; // 기본 값을 소수로 설정
        for(int i = 2; i < n; i++) {
            if(n % i == 0) isPrime = false; // 1과 자신 이외에 나누어 짐
        }
        if(isPrime) return n;
        else return 0;
    }
}


