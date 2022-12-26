package 성적순정렬_복습;
// 이름과 성적에 대한 인스턴스 필드 생성
// 검색을 위한 Comparable 인터페이스 상속을 받아서 구현 (클래스에 대한 정렬 기준을 정함)
// 인터페이스 상속은 반드시 메소드를 구현해줘야 함.
public class StudentInfo2 implements Comparable<StudentInfo2>{
    public String name; // 학생의 이름
    public int score;   // 학생의 성적

    // 생성자 만들기 : 인스턴스 필드에 초기값을 넣어줌
    public StudentInfo2(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(StudentInfo2 o) { // 자기 자신과 매개변수로 들어온 값 비교
        // 성적순 내림차순정렬
//        if(this.score == o.score) return 0; // 정렬 조건이 아님
//        else if(this.score > o.score) return -1; // 내림차순 조건이 아니므로 정렬 안함
//        else return 1; // 정렬 조건이 됨. 자기 자신과 매개변수로 들어온 값을 서로 swap(위치를 바꿈)

        // 이름순 내림차순정렬
//        if(this.name.compareToIgnoreCase(o.name) == 0) return 0; // 문자열의 크기비교 compareTo
//        else if(this.name.compareTo(o.name) < 0) return -1; // 오름차순이면 1
//        else return 1; // 오름차순이면 -1

        // 이것만 써도 내림차순 정렬됨
        return this.name.compareToIgnoreCase(o.name);
    }
}

