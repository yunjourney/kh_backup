package 성적순정렬_복습;

import java.util.Iterator;
import java.util.TreeSet;

// 학생의 이름과 성적을 저장하고 성적이 높은 사람 순으로 정렬
// 이름과 성적은 5명의 데이터를 임의의 값으로 입력함
public class ComSortMain {
    public static void main(String[] args) {
        // 정렬은 TreeSet의 자동 정렬 특성을 이용해 구현
        // TreeSet은 트리가 구성될 때 루트값 기준으로 작은 지 큰 지 비교하여 자동 정렬함
        // 작 큰 비교 조건은 Comparable 를 상속받아 구현한 compareTo 메소드로 결정함
        TreeSet<StudentInfo2> info = new TreeSet<>(); // TreeSet 객체 생성
        info.add(new StudentInfo2("우영우", 95));
        info.add(new StudentInfo2("동그라미", 65));
        info.add(new StudentInfo2("이준호", 77));
        info.add(new StudentInfo2("최수연", 88));
        info.add(new StudentInfo2("정명석", 97));

        // 반복자 생성 : Iterator 는 컬렉션과 set
        Iterator<StudentInfo2>iterator = info.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().name + " ");
        }
    }
}
