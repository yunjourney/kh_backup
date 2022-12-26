package 성적순정렬;

import java.util.Iterator;
import java.util.TreeSet;

// 5명의 성적을 입력받아 성적 정렬
// 이름과 성적을 입력 받아 성적이 높은 사람 순으로 정렬
// 이름과 성적으로 이루어진 클래스 생성 후 정렬
// TreeSet (트리 형태의 자료 구조이며, 트리 생성 싯 자동 정렬 특성을 가지고 있음)
// 클래스 타입으로 트리를 구성하기 위해서는 검색 조건의 기준을 만들어 줘야 한다.
public class ScoreSortMain {
    public static void main(String[] args) {
        // 트리셋에 값이 대입될 때 자동 정렬
        // 값이 입력되면 현재 입력된 값이 루트 노드 기준으로 큰 지 작은 지 판단해서 저장 위치 결정
        TreeSet<StudentInfo> info = new TreeSet<>();
        info.add(new StudentInfo("우영우", 95));
        info.add(new StudentInfo("동그라미", 65));
        info.add(new StudentInfo("이준호", 77));
        info.add(new StudentInfo("최수연", 88));
        info.add(new StudentInfo("정명석", 97));

        Iterator<StudentInfo> iterator = info.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.hasNext());
        }


    }
}
