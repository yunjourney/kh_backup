package 람다만들기;
// 화살표 기호를 사용하여 람다 표현식을 작성할 수 있음
// 매개변수의 타입을 추론 할 수 있는 경우 타입 생략 가능
// 매개변수가 하나인 경우 () 생략 가능
// 함수의 몸체가 하나의 명령문으로만 이루어진 경우 {} 생략 가능
// 상속을 주기 위한 선언부만 만들 수 있음
// 함수형 인터페이스 : 참조변수의타입 참조변수의이름 = 람다표현식


@FunctionalInterface
// 인터페이스 선언에 해당 어노테이션을 붙이면
// 컴파일러는 해당 인터페이스를 함수형 인터페이스로 인식함.
// 함수형 인터페이스는 한 개의 메소드만 허용함.

interface MyFuncInterface {
//    public void method(int x);

    public int min(int x, int y); // 둘 중 작은 값을 반환
}


//interface Calculator {
//    int sum(int a, int b);
//}

//class MyCalculator implements 람다만들기.Calculator {
//    @Override
//    public int sum(int a, int b){
//        return a + b;
//    }
//}

public class LambdaEx {
    public static void main(String[] args) {
        // MyCalculator mc = new MyCalculator();
        // int result = mc.sum(10, 30);
        // 인터페이스를 상속받아서 클래스 대신 람다시으로 구현
        // (매개변수목록) -> (a + b);
        // (int a, int b) 는 Calculator 인터페이스의 sum 함수의 입력 항목에 해당
        // -> 뒤의 (a + b) 리턴값에 해당
        // 람다 함수를 이용해서 MyCalculator와 같은 실제 클래스 없이 객체 생성 가능
//        Calculator mc = (int a, int b) -> (a + b);
//        int result = mc.sum(10,30);
//        System.out.println(result);

        // 매개변수(x)가 있는 람다식
//        MyFuncInterface fi = (x) -> { // method(x)에 대한 구현부가 됨
//            int result = x * 5;
//            System.out.println(result);
//        };
//        fi.method(10);

        MyFuncInterface fi = (x, y) -> x < y ? x : y; // 구현부
        System.out.println(fi.min(3,4));
    }
}
