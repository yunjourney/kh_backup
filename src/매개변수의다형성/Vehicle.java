package 매개변수의다형성;
// vehicle을 통해 버스,택시,스포츠카가 상속(오버라이딩)되어 만들어짐
public class Vehicle {
    public void run() {
        System.out.println("차량이 달립니다.");
    }
}
class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
class SportsCar extends Vehicle {
    @Override
    public void run() {
        System.out.println("스포츠카가 달립니다.");
    }
}
class Truck {
    public void run() {
        System.out.println("트럭이 달립니다.");
    }
}