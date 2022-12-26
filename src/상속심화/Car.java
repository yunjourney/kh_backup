package 상속심화;
// 기본 클래스 : 상속을 주기위한 클래스
public class Car {
    int speed;
    String color;
    String name;
    final void accelerator() { // final을 걸면 오버라이딩 금지시켜줌
        System.out.println("차의 속도를 증가 시킵니다.");
    }
    final void breakPanel() {
        System.out.println("차의 속도를 감소 시킵니다.");
    }
}
class SportsCar extends Car {
    boolean isTurbo;
    SportsCar(String name) {
        isTurbo = false;
        speed = 280;
        this.name = name;
        this.color = "Red";
    }
    int getSpeed() { // getter 메소드
        if(isTurbo) return speed *= 1.2;
        return speed;
    }
    boolean isTurbo() {
        return isTurbo;
    }
    void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }
//    @Override // 명시적으로 컴파일러에게 오버라이딩관계인지 체크해줘
//    void accelerator() {
//        System.out.println("속도를 200% 증가합니다.");
//    }
//    @Override
//    void breakPanel() {
//        System.out.println("차를 정지 상태로 만듭니다.");
//    }
    void infoCar() {
        System.out.println("이름 : " + name); // 인스턴스필드로 읽은거
        System.out.println("속도 : " + getSpeed()); // 클래스 내부의 메소드 호출. 터보모드에 따라 결과값이 달라지니까.
        System.out.println("색상 : " + color);
        System.out.println("터보모드 : " + isTurbo);
    }
}
class ElectricCar extends Car {
    boolean isAutoDrv; // 자율주행모드
    ElectricCar(String name) {
        isAutoDrv = false;
        speed = 200;
        this.name = name;
        color = "White";
    }
    boolean isAutoDrv() {
        return isAutoDrv;
    }
    void setAutoDrv(boolean autoDrv) {
        isAutoDrv = autoDrv;
    }
    void infoCar() {
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율주행 : " + isAutoDrv);
    }
}