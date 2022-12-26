package 비트연산;
// 비트연산이란 : 0과 1로 구성된 1개의 비트끼리 연산을 수행
// & : bit AND, 값이 둘다 1이면 1이 됨
// | : bit OR, 둘 중 하나만 1이면 1이 됨
// ^ : bit XOR, 익스클루시브 or 두 값이 같으면 0, 다르면 1 출력
// ~ : 비트를 반전(0이면 1, 1이면 0으로 반전)
// << : 왼쪽으로 지정된 수 만큼 비트를 이동시킴
// >> : 오른쪽으로 지정된 수 만큼 비트를 이동시킴
public class BitOpEx1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);
        System.out.println(num1 << 1);
        System.out.println(num1 >> 1);
    }
}
