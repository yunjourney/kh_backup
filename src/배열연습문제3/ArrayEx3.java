package 배열연습문제3;
// 햄버거 3개, 음료 2개를 배열로 입력 받음 (햄버거 0,1,2 배열, 음료는 3,4 배열)
// 배열의 0 ~ 2까지에서 제일 작은 값 골라내기
// 배열 인덱스 3번의 값과 4번의 값 중에서 작은 값 선택
// 세트 메뉴 가격 = 햄버거(제일 싼 거) + 음료(제일 싼 거) - 50
import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        // 햄버거와 음료를 입력 받기 위한 배열 선언 (총 5개)
        // 햄버거와 음료에 대한 가격을 입력받기 위한 스캐너 생성
        // 반복문과 스캐너를 이용해서 배열에 햄버거와 가격 입력받음
        // 제일 싼 햄버거를 선택하기 위한 변수를 생성하고, 배열의 0번 인덱스의 값을 넣어줌 (0번째 값과 비교)
        // 제일 싼 음료를 선택하기 위한 변수를 생성하고, 배열의 3번 인덱스의 값을 넣어줌
        // 출력 : 햄버거 변수 + 음료 변수 - 50
        int [] menu = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("가격 입력 : ");
        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }
        int minBurger = menu[0]; // 최소값 선택하기 위한 기준으로 만들 값 생성
        int minDrink = menu[3];
        for (int i = 0; i < menu.length; i++) {
            if ((i < 3) && (minBurger > menu[i])) minBurger = menu[i]; // minBurger보다 싼 메뉴[i]가 있으면 그걸 넣어라
            if ((i > 2) && (minDrink > menu[i])) minDrink = menu[i]; // 최소/최대값 구하려면 해당 인덱스에서 값 하나 골라서 기준
        }
        System.out.println(minBurger + minDrink - 50);

    }
}

