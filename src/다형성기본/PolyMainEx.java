package 다형성기본;
// 다형성 : 객체지향 프로그램의 핵심 문법이다.
// 한가지 이름으로 여러가지 메소드를 처리 가능 (오버로딩)
// 여러가지 타입을 한 가지 타입으로 처리 할 수 있는 기술을 의미
// 즉, 부모 클래스의 타입의 참조변수로 자식클래스의 인스턴스를 참조 할 수 있다.
public class PolyMainEx {
    public static void main(String[] args) {
        Child c = new Child(); // 자식 클래스의 참조변수로 자식 객체를 접근
        c.display();
        c.out();
        System.out.println();

        Parent p = new Child(); // 부모 클래스의 참조변수로 자식 객체 접근
        p.display(); // 자식 객체 출력. 오버라이딩 된 걸 가리킴
        // p.out; // 자식한테만 있는 메소드라서 접근 불가능. 에러뜸
        ((Child)p).out(); // 이렇게 하면 접근은 가능. 부모클래스를 자식클래스 타입으로 형 변환 시켜버린것. 잘 안씀.

    }
}
