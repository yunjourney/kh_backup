package 피시방알바;
public class PcRoomEx {
    public static void main(String[] args) {
        // 모듈화 (각각의 메소드를 만들고 main에서는 호출만 함)
        PcRoomCls pcRoomcls = new PcRoomCls();
        pcRoomcls.inputPerson(); // 사용자 수를 입력 받음
        pcRoomcls.calcSeat(); // 사용자가 요청한 좌석에 따라 거절 횟수 누적
        System.out.println(pcRoomcls.getRejectCnt());
    }
}


