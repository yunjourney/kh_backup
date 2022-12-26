package 상속심화2;
// super : 자식클래스가 부모클래스로부터 상속받은 멤버를 참조할 때 사용
// this : 인스턴스 필드와 매개변수를 구분하기 위해 사용하는 것과 유사
// super() : 부모 생성자를 호출, 부모생성자가 디폴트인 경우는 호출이 필요없음, 필드에 대입하는 값이 생긴다면 반드시필요
//
public class SuperMainEx {
    public static void main(String[] args) {
        Child child = new Child(28); // 자식의 타입이 int x니까 값넣어줘야 오류안생기네
        child.childMethod();
    }
}
class Parent {
    int x = 10;
    String name;
    Parent() {

    }
    Parent(int x) {
        this.x = x;
    }
    Parent(String name) {
        this.name = name;
    }
}
class Child extends Parent {
    int x = 20;

    Child(int x) {
        super("우영우"); // 부모의 동일 타입 생성자 호출해줌. 여기에 string 썼으니 부모의 string 생성자가 호출되는 것
    }

    void childMethod() {
        System.out.println("x : " + x); // 본인(자식)
        System.out.println("this.x : " + this.x); // 본인(자식)
        System.out.println("super.x : " + super.x); // 부모
        System.out.println("이름 : " + name);
    }
}
