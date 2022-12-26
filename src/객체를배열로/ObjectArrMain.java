package 객체를배열로;

import java.util.Scanner;

// 객체를 배열로 관리하기
public class ObjectArrMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 인원 : ");
        int cnt = sc.nextInt();
        NameCard[] nameCards = new NameCard[cnt]; // 여기까진 객체를 저장할 배열의 틀만 만든 것
        System.out.println("정보입력");
        System.out.println("------------------");
        for(int i = 0; i < cnt; i++) {
            nameCards[i] = new NameCard(); // 배열 안에서 각각 객체를 가리킨다.
            System.out.print("이름 : ");
            nameCards[i].setName(sc.next());
            System.out.print("나이 : ");
            nameCards[i].setAge(sc.nextInt());
            System.out.print("메일 : ");
            nameCards[i].setMail(sc.next());
            System.out.print("연락처 : ");
            nameCards[i].setPhone(sc.next());
        }
        for(NameCard e : nameCards) e.printCard();
    }
}
