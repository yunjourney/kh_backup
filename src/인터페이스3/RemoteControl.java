package 인터페이스3;
// 인터페이스에 포함되는 것들
// 상수 : 모든 필드는 자동으로 상수(final static)로 변환된다.
// 메소드 : 모든 메소드는 추상 메소드로 변경된다.★ (자동으로 abstract 붙는다.)
// 디폴트 메소드 : 예외적인 상황. 구현부를 가짐. 상속받은 클래스가 재정의해서 사용 가능함.
// 기존 인터페이스로 구현했던 게 광범위하게 사용되므로 특정 상속관계에만 영향을 주도록 재정의해서 쓴다.
// 마지막으로 오버라이딩된 거로 덮어쓴다.
// 정적 메소드 : static, 객체와 상관없이 인터페이스 타입으로 사용

public interface RemoteControl {
    int MAX_VOLUME = 100; // 자동으로 앞에 final static이 붙는다. 인스턴스필드가 아니므로 대문자
    int MIN_VOLUME = 0;
    void turnON();        // 자동으로 abstract가 붙는다. 모든 메소드가 추상메소드가 되어야하니까
    void turnOFF();
    void setVolume(int volume);
    // 디폴트 메소드 : jdk 1.8 이후에 추가 됨, default 키워드 사용. 안쓰고싶으면 안써도된다
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }
    static void changeBattery() {
        System.out.println("건전지를 교체합니다.");
    }
}
