package 성적순정렬;
// 이름과 성적을 저장
// Comparable interface 구현, compareTo() 메소드를 상속받아 우리가 정한 기준으로 정렬
public class StudentInfo implements Comparable<StudentInfo>{
    String name;
    int score;
    // 생성자를 통해서 인스턴스 필드를 초기화
    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    // 성적이 높은 사람 순으로 정렬 (내림차순)
    // compareTo()는 정수형 반환값을 가짐. 같으면 0, 다르면 1, -1 반환
    // 반환값이 1인 경우는 정렬 조건이 되고, -1이면 현 상태 유지
    // compareTo() 메소드는 매개변수가 1개이며, 자신과 매개변수로 넘어온 개체를 비교
    public int compareTo(StudentInfo o) {
        if(this.score == o.score) return 0;
        else if(this.score > o.score) return -1; // 정렬하지 않겠다는 뜻
        else return 1; // 정렬 조건이 된다

    }
}
