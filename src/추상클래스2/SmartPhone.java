package 추상클래스2;
public class SmartPhone extends Phone {
    // 부모 클래스가 생성자가 매개변수 있는 타입으로 있으니까 super 넣어줘야함
    public SmartPhone(String name) {
        super(name); // 부모의 생성자를 호출
    }

    @Override
    void call() {
        System.out.println("부모의 요청으로 통화 기능을 완성합니다.");
    }
    public void internet() {
        System.out.println("인터넷을 검색합니다.");
    }
}
