package 추상클래스;
// 추상클래스를 만들기 위해서는 class 이름 앞에 abstract 키워드 필요
public abstract class Animal {
    // 일반 메소드. 비어있어도 {}(body. 내부 블록. 구현부)가 있다. = 추상메소드가 안된다. -> 아래 cat이 상속하면 일반 오버라이딩 관계
    // void cry() {}
    abstract void cry(); // 추상메소드 선언만 있고 구현부가 없어야 함. -> 자식클래스가 반드시 구현
}
class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("냐옹냐옹~");
    }
}
class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍!!!");
    }
}