package 평가2_서술형;

import API클래스.Member;

import java.util.Scanner;

// [서술1] 반복문
// - for() : 반복횟수가 정해져 있을 때 주로 사용
// - while() : 반복횟수가 정해져 있지 않을 때 주로 사용
// - do ~ while() : 무조건 1번은 수행되는 반복문(조건식이 마지막에 있음)
// - 반복 여부를 결정하는 조건식이 맨 아래에 존재
// [서술2] 무한 반복문 while에서 1부터 10까지만 출력 할 수 있는 방법을 제시하시오.
// 단, while문에서 while(true) 유지하면 만점
// [서술3] 문자열 배열을 만들어서 "사과", "딸기", "오렌지"로 초기화
// [서술4] 구구단 출력 문제 : 2단만 출력(싱글 for문 사용)
// [서술5] 패스
// [서술6] 문자열 출력하기
// [서술7] 배열의 얕은 복사, 깊은 복사를 설명하시오.
// - 얕은 복사 : 주소가 복사됨. 참조 변수 사용 시 변수에 값이 복사가 되지않고 주소가 복사되는 것을 의미
// - 깊은 복사 : 값이 복사됨.
// [서술8] 배열의 깊은 복사를 할 수 있는 방법 3가지 : for, arraycopy, copyOf()
// [서술9] 배열의 특징 2가지 : 같은 데이터 타입, 크기 변경 불가능, 여러개의 값을 연속으로 저장할 수 있다
// - 같은 타입이 연속으로 존재하는 유한의 데이터를 저장하는 공간
// [서술10] int 자료형을 10개 담을 수 있는 공간 iArr을 생성하시오
// [서술11] double 자료형 5개 담을 수 있는 dArr 생성
// [서술12] 어떤 값이 출력되는 지? 1) 주소값 출력 2) 0 출력
// [서술13]문자열 String 참조변수에 아무것도 대입되지 않으면 null (참조형에서 주소가 할당되어 있지 않을 때)
// - 객체를 만들고 아무것도 대입하지 않으면 null
// - null을 참조하는 객체를 호출하면 NullPointException Error 발생
// [서술14] 배열을 for문으로 출력하는 문제
// [서술15] 클래스 변수와 인스턴스 변수의 초기화 순서
// - 클래스 변수 : JVM이 정한 기본값 -> 명시적 초기화 -> 초기화 블록
// - 인스턴스 변수 : JVM이 정한 기본값 -> 명시적 초기화 -> 초기화 블록 -> 매개변수 생성자
// - 강사님 답 - 클래스 변수 : 클래스 생성 시 초기화
// - 강사님 답 - 인스턴스 변수 : 객체 생성 시 생성자를 통해 초기화
// [서술16] getter/setter 작성 문제
// [서술17] 접근제한자의 접근 가능 범위에 대해 기술하시오
// - private : 클래스 내에서만 접근 가능 (클래스 내부의 메소드를 통해 필드 접근)
// - default : (키워드는 없음) 동일 패키지 내에서 접근 가능
// - protected : 동일 패키지 내에서 접근 가능, 만약 다른 패키지에 있더라도 상속 관계면 접근 가능
// - public : 모든 패키지에서 접근 가능
// [서술18] 필드에 들어갈 수 있는 접근 제한자를 기술하시오
// - private, default, protected, public
// - 필드란? 클래스 내부에서 사용되는 변수를 의미함
// [서술19] 메소드에 들어갈 수 있는 접근 제한자 기술
// - 메소드란? 클래스 내부에서 사용되는 하나의 동작 기능을 구현한 것
// - 필드에 대해 값을 쓰거나 읽는 동작을 위해 사용되기도 함 (게터/세터)
// [서술20] 객체지향 프록램의 3대 특징에 대해 쓰시오
// - 상속, 다형성, 캡슐화(데이터 은닉), (추상화)
// [서술21] 자바에서 클래스 변수, 인스턴스 변수, 지역 변수의 특징에 대해서 기술
// - 클래스 변수 : static 선언된 필드(멤버) 변수, 클래스 소속되고 객체로 만들어 지지 않는다.
// - 프로그램 실행 시 정적 메모리 영역에 할당되고 프로그램 종료 시 소멸 된다.
// - 인스턴스 변수 : new에 의해서 객체로 만들어 생성되는 변수(heap 영역에 할당), this 참조변수로 접근 가능
// - 지역 변수 : 메소드 또는 제어문 내에서 선언된 변수를 의미하고 stack 영역에 생성됨
// - 해당 메소드나 제어문을 벗어나면 자동 소멸된다
// [서술22] 메소드 오버로딩에 대해 설명하시오
// - 동일한 메소드 이름을 사용하고, 매개변수의 타입이나 개수로 메소드를 자동으로 호출함
// - 키워드 (동일한 메소드 이름, 매개변수, 반환타입으로 결정되지 않는다)
// [서술23] public class 클래스명{}, class 클래스명{} 차이가 뭔지 설명
// - 클래스명에서는 접근제한자 public 이거나 없거나(=default) 둘 중 하나만 존재함
// - public 불어 있으면 해당 파일의 주인이 된다. 다른 패키지에서 import해서 사용 가능
// - public 없으면 해당 패키지 안에 있는 클래스 끼리만 사용 가능
// - 왜냐면 import 할 수 없기 때문에
// [서술24] 클래스에 들어갈 수 있는 접근 제한자 기술
// - public, default
public class TestPassMainEx3 {
    public static void main(String[] args) {

        // [문1]
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//
//        for(int i = 0; i < age; i++) {
//            System.out.println("입력 받은 나이에 대한 범위 : " + i);
//        }
//
//        int i = 0;
//        while(true) {
//            i++;
//            System.out.println("입력 받은 나이의 범위 : " + i);
//            if(i == age) break;
//        }
//
//        do {
//            i++;
//            System.out.println("입력 받은 나이의 범위 : " + i);
//        } while(i < age);

        // [문2]
//        int i = 0;
//        while(true) {
//            i++;
//            System.out.println(i + " ");
//            if(i >= 10) break;
//        }

        // [문3]
        // 방법 1 : 선언과 동시에 문자열 대입
        // String[] fruit = {"사과", "딸기", "오렌지"};
        // 방법 2 : 선언 이후 값을 대입
//        String[] fruit = new String[3];
//        fruit[0] = "사과";
//        fruit[1] = "딸기";
//        fruit[2] = "오렌지";
//
        // [문4]
        for(int i = 1; i < 10; i++) {
            System.out.println(2 + "*" + i + "=" + (2*i));
        }

        // [문6]
        String[] fruit = {"수박", "포도", "딸기"};
        for(String e : fruit) System.out.println(e + " ");
        for(int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i] + " ");
        }

        // [문10,11,12]
        int[] iArr = new int[10]; // [문10]
        double[] dArr = new double[5]; // [문11]
        System.out.println(iArr); // [문12] 참조변수는 값이 없고 주소값을 가진다
        System.out.println(iArr[5]); // 해당값을 넣지 않았으므로 0이 출력된다

        // [문13]
        String[] sArr = new String[3];
        System.out.println(sArr); // 주소값이 출력 된다
        System.out.println(sArr[0]); // null

        // [문14]
        int[] iArr14 = {1,2,3,4,5};
        for(int i = 0; i < iArr14.length; i++) {
            System.out.println(iArr14[i]);
        }

//        // [문16] 메인영역 구현 참고. 문제는 아닌듯??
//        MemberInfo memberInfo = new MemberInfo();
//        memberInfo.setMemberId("1004");
//        System.out.println(memberInfo.getMemberId());

        // [문21]
        MemberInfo memberInfo = new MemberInfo("GV80");
        System.out.println(MemberInfo.company);
    }
}
// [문16]
//class MemberInfo {
//    private String memberId; // 인스턴스 필드를 생성하고 접근제한함
//    // 게터는 접근제한자가 public
//    // 일반적으로 인스턴스 필드의 값을 반환함
//    public String getMemberId() {
//        return memberId; // 해당 인스턴스 필드값을 반환
//    }
//    // 세터는 일반적으로 반환 값이 없음. 매개변수로 값을 전달받음
//    public void setMemberId(String memberId) {
//        this.memberId = memberId; // = 뒤에 매개변수로 전달받은 값 써줌
//    }
//}
// [문17]
//class MemberInfo {
//    private String test1; // private
//    String test2; // default
//}
// [문21]
class MemberInfo {
    static String company = "현대자동차";
    String modelName; // 인스턴스 변수 또는 인스턴스 필드 라고 부름
    public MemberInfo(String modelName) {
        this.modelName = modelName;
    }
}