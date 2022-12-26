package 평가2_2;
// 클래스 관련 문제 (클래스 다이어그램)
// + UNIT : String = "원" -> public static final String UNIT = "원";
// - money : into -> private int money;
// + Money(money:int) -> public Money(int money) 메인에서 호출할 때 확인 필요
// 생성자의 매개변수 유무 확인하기
public class TestPassClassEx {
    public static void main(String[] args) {
        Money money = new Money(10000); // [문3-2]
        money.print();
//        Money m = new Money(10000);
//        m.print();
    }
}
