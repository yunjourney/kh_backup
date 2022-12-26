package 피시방알바;
import java.util.Scanner;

public class PcRoomCls {
    private int[] pcRoom = new int[100]; // pc방의 pc대수
    private int person = 0;
    private int rejectCnt = 0;
    // 손님의 수를 입력 받음
    void inputPerson() {
        Scanner sc = new Scanner(System.in);
        person = sc.nextInt();
    }
    // 손님의 요청한 자리가 예약되었는지 확인하고 거절횟수 누적하는 메소드
    void calcSeat() {
        int seatNumber = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < person; i++) {
            seatNumber = sc.nextInt();
            if(pcRoom[seatNumber - 1] == 1) rejectCnt++;
            else pcRoom[seatNumber - 1] = 1;
        }
    }
    int getRejectCnt() {
        return rejectCnt;
    }
}
