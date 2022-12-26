package 생성자복습;
// 생성자의 주요 임무는 인스턴스 필드에 대한 초기화 작업을 진행
public class Car {
    // 클래스 필드 : 클래스 생성 시 만들어지며 객체로 생성되지 않는다.
    static final String company = "현대자동차"; // 제조사는 고정이니까 static으로 + final까지 넣으면 값도 최종값이라 항상 이대로.
    String model;
    String color;
    int speed;
    int horsePower;
    Car() {}
    Car(String model) {
        this.model = model;
    }
    Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 200;
        this.horsePower = 200;
    }
    Car(String model, String color, int speed, int horsePower) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.horsePower = horsePower;
    }
    public void carInfo() {
        System.out.println(company);
        System.out.println(model);
        System.out.println(color);
        System.out.println(speed);
        System.out.println(horsePower);
    }
}
