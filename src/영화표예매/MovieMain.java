package 영화표예매;

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket(12000); // MovieTicket(); 기본 생성자 자동호출됨. 클래스 설정 때 초기값 설정할 필요가 없어서.
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("[1]예매하기");
            System.out.println("[2]종료하기");
            int selectMenu = sc.nextInt();
            if(selectMenu == 1) ticket.selectSeat();
            else {
                System.out.println(ticket.totalAmount());
                break;
            }
        }
    }
}
