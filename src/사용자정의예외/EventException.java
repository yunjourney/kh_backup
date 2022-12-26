package 사용자정의예외;
// Exception : 모든 예외 클래스의 조상 클래스
public class EventException extends Exception {
    private Integer number = null; // 정수형에 대한 참조 타입
    public EventException(int number) {
        this.number = number; // Auto Boxing
    }
    @Override
    public String getMessage() {
        if(number == null) {
            return "숫자가 아닙니다.";
        } else {
            return Integer.toString(number) + "는 짝수가 아닙니다.";
        }
    }
}
