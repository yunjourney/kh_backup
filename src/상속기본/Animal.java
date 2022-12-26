package 상속기본;
public class Animal {
    // 접근제한자:같은 클래스+부모자식간(상속관계) 사용 / private은 같은 클래스 내에서만 접근가능. 앞에 붙으면 상속불가
    protected String name;
    void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + "zzz"); // 부모한테 상속받았으니 this.name으로 사용가능
    }
}
class HouseDog extends Dog {
    @Override // @어노테이션. 오버라이딩을 올바르게 했는지 컴파일러가 체크한다
    void sleep() {
        System.out.println(this.name + "zzz in house");
    }
}
