package 입출력연습;

public class InOutEx1 {
    public static void main(String[]args) {
        String name = "우영우"; // 문자열은 " "
        String addr = "서울시 강남구";
        char gender = 'F'; // 문자는 ' '
        int age = 28;
        int kor = 99;
        int eng = 98;
        int math = 99;
        long score = 199999;
        boolean isTrue = true;
        double aver = 0.0;

        // 자바 스타일 : println()과 print() : 메소드 오버라이딩이 되어 있어 자동으로 형에 맞는 메소드 호출
        System.out.println("이름 : " + name); // 문자열에서 +는 문자열을 이어주는 역할을 한다.
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender); // 문자열과 char형을 더하면 둘다 문자열이 된다. (결합에 대한 우선순위 고려)
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + math));
        System.out.println("평균 : " + ((double)kor+eng+math)/3);
        System.out.println("참 또는 거짓 : " + isTrue);
        // 서식 지정 스타일 : printf()
        // 서식 지정자 : %로 시작한다. " " 구간이 출력 구간이며 여기에 서식을 넣는다. 서식 갯수와 출력 갯수 동일해야함.
        // 이스케이프 문자 : \(백슬래쉬)로 시작한다. \n는 new line(줄바꿈)
        // %s : string(문자열) 출력 서식, %d : 정수 출력
        // %f : float(실수)에 대한 출력, %.2f는 소수점 2자리에서 반올림
        System.out.printf("이름 \\ 주소 : %s %s\n", name, addr);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor + eng + math);
        System.out.printf("평균 : %.2f\n", ((double)kor+eng+math)/3);
        System.out.printf("참과 거짓 : %b\n", isTrue);
        System.out.printf("스코어 : %d\n", score);
        System.out.printf("오늘의 습도는 %d%%입니다.\n", 40);
        System.out.printf("Banana\rApple\n"); // r은 캐리지리턴?커서를 앞으로 돌린다. apple이 덮어버림
        System.out.printf("Banana\t\thahaha\b\b\b"); // \b는 backspace (for문 1,2,3,)일 때 마지막 ,를 지우고 싶을 때 사용 \t는 tap


    }
}
