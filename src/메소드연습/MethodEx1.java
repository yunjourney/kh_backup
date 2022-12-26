package 메소드연습;
// 자바의 클래스는 1)멤버로 속성을 표현하는 필드와 2)기능을 표현하는 메소드를 가짐
// 메소드는 반복되는 코드를 하나의 기능으로 만들어 중복 구현을 방지
// 기능을 모듈화해서 가독성을 높임
// 문제점을 발견하거나 수정이 간편함
// 가급적 하나의 메소드는 하나의 기능만 수행하도록 구현한다.
public class MethodEx1 {
    public static void main(String[] args) {
        MethodEx1 methodEx1 = new MethodEx1();
        System.out.println(methodEx1.sum(10, 20)); // return 결과값이 여기로 호출돼서 남는 것.
        methodEx1.test(); // 반환 타입이 없기 때문에 출력문 안쓰고 표현.
    }
    // 메소드는 camel 표기법을 따르면 첫 자가 소문자
    // 접근제한자 반환타입 메소드이름(매개변수 목록) { }
    // 반환 타입은 해당 메소드가 호출되면 수행 후 결과를 반환하는 타입을 의미한다.
    // 반환 타입과 return 키워드 이후의 값의 타입이 일치해야한다.
    // 반환 타입이 정수이고 매개변수가 2개인 경우
    public int sum(int a, int b) { // 위 출력문 안에 있는 a,b값이 여기에 복사되는 것이다.
        return a + b;
    }
    // 반환 타입도 없고 매개변수도 없음
    public void test() { // void는 호출하고 나서 결과를 되돌려주지않는다.
        System.out.println("Test 메소드를 호출 했습니다.");
        return; // 되돌려줄 값이 없으므로 값(return 0과 같이)을 넣으면 안된다.
    }
}
