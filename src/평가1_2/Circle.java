package 평가1_2;

// UML로 표기된 다이어그램에서 접근제한자와 매개변수를 확인
// + : public
// - : private

public class Circle {
    // 접근제한자 (+), 더이상 변경 불가능하도록 final로 선언함.
    public final static double PI = 3.14;
    // [문1] 접근제한자 (-), 클래스 내부에서만 접근 가능
    private double radius;
    // [문2] 기본 생성자가 아니고 매개변수가 있는 생성자
    public Circle(double radius) {
        this.radius = radius;
    }
    // setter/getter 는 인스턴스 필드에 대해서 값을 읽거나 쓰기 위한 메소드를 만드는 것
    // radius가 private이니까 게터세터로 가져와야한다
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public static double getPi() {
        return PI;
    }
    public void draw() {
        System.out.println("반지름 " + radius + "cm인 원을 그립니다.");
    }
}
