package 추상클래스;
public class AbstractMain {
    public static void main(String[] args) {
        // 내부에 abstract가 있는 추상클래스이므로 객체 생성 안됨. 단지 상속을 주기 위해서만 존재. 자기자신이 객체화가 되면 안됨
        // Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.cry();
        dog.cry();
    }
}
