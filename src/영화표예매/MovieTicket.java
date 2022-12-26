package 영화표예매;
import java.util.Scanner;
// 좌석에 대한 영화표를 판매하고 총 금액 구하기
// 좌석은 배열로 총 10개 생성
// 판매액은 좌석 당 12,000원
// 이미 예약된 좌석은 이미 판매되었다고 표시
public class MovieTicket {
    int ticketPrice;
    int seat[] = new int[10]; // 배열로 좌석을 10개 생성
    // 화면에 선택 가능한 좌석 표시하는 메소드, 판매된 좌석은 [v], 판매되지 않은 좌석은 [ ]
    MovieTicket(int price) {
        ticketPrice = price;
    }
    void printSeat() { // 반환타입,매개변수없어됨. 좌석표시만하는용도, seat한테 자기객체를 참조하기 떄문에.(동일클래스)
        for(int i = 0; i < seat.length; i++) {
            if(this.seat[i] == 0) System.out.print("[ ]"); // this.seat[i] 에서 this 생략가능. seat는 인스턴스필드(같은 클래스 내)니까 사용가능
            else System.out.print("[v]");
        }
        System.out.println();
    }
    // 좌석을 선택하는 메소드
    void selectSeat() { // 자기 클래스 내에 있는 메소드가 다른 메소드 호출가능
        printSeat(); // 현재 좌석상태를 보여줌
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 번호를 입력하세요 : ");
        int seatPos = sc.nextInt(); // 사용자의 좌석 번호는 배열의 인덱스보다 1크다. 이 메소드 안에서만 사용되는 지역변수
        if(seat[seatPos-1] == 0) { // 아직 판매되지 않은 자리
            seat[seatPos-1] = 1; // 판매된 좌석으로 변경
            printSeat(); // 판매 이후 좌석 상태를 보여줌
        } else System.out.println("이미 판매된 좌석입니다. 다른 좌석을 선택하세요.");
    }
    int totalAmount() { // 정수로 반환해서 메인으로 넘겨줄 것이다.
        int cnt = 0;
        for(int e : seat) {
            if(e == 1) cnt++;
        }
//        return cnt * 12000; // 하드코딩. 값을 아예 받아버린 것
        return cnt * ticketPrice;
    }
}
