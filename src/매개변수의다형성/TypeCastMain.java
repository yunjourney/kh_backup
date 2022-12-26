package 매개변수의다형성;

import java.util.Scanner;

// 자동 타입 변환
public class TypeCastMain {
    public static void main(String[] args) {
        Driver driver = new Driver("우영우");
        Vehicle vehicle = new Vehicle();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        SportsCar sportsCar = new SportsCar();
        Truck truck = new Truck();

        System.out.println(bus instanceof Vehicle); // true
        System.out.println(taxi instanceof Vehicle); // true
        System.out.println(vehicle instanceof SportsCar); // false

        Scanner sc = new Scanner(System.in);
        System.out.print("운전하고 싶은 차를 선택하세요. [1]Bus [2]Taxi [3]SportsCar : ");
        int selectCar = sc.nextInt();
        switch (selectCar) {
            case 1 : driver.drive(bus); break;
            case 2 : driver.drive(taxi); break;
            case 3 : driver.drive(sportsCar); break;
            // case 4 : driver.drive(truck); break; // 상속관계가 없으므로 에러가 난다
        }
    }
}
