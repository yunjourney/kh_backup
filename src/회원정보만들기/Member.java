package 회원정보만들기;

import java.util.Scanner;

// 이름(문자열), 나이(정수), 성별(문자), 직업(정수)
// 나이를 입력 받기 : 1 ~ 199 사이 입력
// 성별은 'm', 'M', 'f', 'F'
// 직업은 1 ~ 4
// 전체 출력 : 회원정보 전체 출력
public class Member { // class앞에는 public이 붙은 게 주인
    private String name; // 인스턴스(객체 변수) 필드
    private int age; // 접근제한자private 캡슐화 외부에 숨겨짐
    private char gender;
    private int jobs;

    // 이름을 입력 받는 setter 메소드
    public void setName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력 하세요 : ");
        this.name = sc.next(); // this(자기 참조 포인터변수)가 있어서 위에 전역변수 참조하는 것. this가 곧 member. this는 생략가능(생략안되는 경우 추후 설명)
    }
    public void setAge() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
            if (age > 0 && age < 200) return; // 나를 불러준 쪽으로 되돌아간다. main이 이 메소드를 호출하면 거기로 간다
            System.out.println("나이를 잘못 입력하셨습니다.");
        }
    }
    public void setGender() {
//        if(!xxx) return; // 방어코드, 안불려져야하는데 불려질 경우를 대비해서 메소드 시작하자마자 바로 종료
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("성별을 입력하세요 : ");
            gender = sc.next().charAt(0); // 문자열에서 0번째 문자를 추출
            switch (gender) {
                case 'M':
                case 'm':
                case 'F':
                case 'f':
                    return; // return시 메소드 종료, break면 switch 종료
                default:
                    System.out.println("성별을 잘못 입력하셨습니다.");
                    continue; // 반복문으로 되돌아감
            }
        }
    }
    public void setJobs() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("직업을 입력하세요 : ");
            jobs = sc.nextInt();
            if (jobs > 0 && jobs < 5) return; // 1.학생, 2.회사원, 3.주부, 4.무직
            System.out.println("직업을 잘못 입력하셨습니다.");
        }
    }
    public int getGenderType() {
        if(gender == 'M' || gender == 'm') return 1; // M과 m일 때 int형인 1로 변환한 것
        else return 2;
    }

    public void viewInfo() {
        final String[] genderStr = {"", "남성", "여성"}; // 문자열 배열. 인덱스 0을 ""로 처리함. return 남성 1 여성 2
        final String[] jobsStr = {"", "학생", "회사원", "주부", "무직"}; // final : 한번 정의하면 값을 안바꿈. 출력만을 위한 값이므로 사용함
        System.out.println("======== 회원 정보 ========");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]); // getGenderType을 불러서 return 1아니면 2로 반환 -> 배열 인덱스
        System.out.println("직업 : " + jobsStr[jobs]); // 만약 배열 인덱스에 0번째 값 ""이 없다면 [jobs-1]하면 같은 값 나옴
    }
}