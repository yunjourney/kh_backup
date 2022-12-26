package 문자열분리;

public class ClassClassEx {
    public static void main(String[] args) {
        Car car = new Car();
        Class cls = car.getClass(); // Class 라는 클래스
        System.out.println(cls.getName()); // 패키지 이름과 클래스 이름
        System.out.println(cls.getSimpleName()); // 클래스 이름
        System.out.println(cls.getSuperclass()); // 오브젝트
        System.out.println(cls.getPackage().getName()); // 패키지 이름만
    }
}
class Car {}