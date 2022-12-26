package 트리셋;

import java.util.Iterator;
import java.util.TreeSet;

// TreeSet : 값이 추가될 때 자동정렬이 이루어지면서 검색 기능이 강화된 자료 구조
// 이진 검색 트리, 데이터 추가/제거의 기본 동작이 매우 빠름
// 좌, 우 노드를 참조하기 위한 두개의 참조 변수로 구성됨
public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(30); // 값 추가 시 자동으로 정렬됨
        ts.add(40);
        ts.add(20);
        ts.add(10);
        ts.add(45);

        for (Integer e : ts) System.out.print(e + " ");
        ts.remove(40); // 값 삭제
        System.out.println(ts.size()); // 노드의 개수 : 4
        System.out.println(ts.subSet(10, 31)); // 부분집합을 나타냄(10 이상 ~ 31 미만) : [10, 20, 30]

//        // 향상된 for 문
//        for (int e : ts) System.out.print(e + " ");
//        for (int e : ts) System.out.print(e + " ");
//        System.out.println(); // 10 20 30 40 45 10 20 30 40 45
//
//        // Iterator() 사용
//        Iterator<Integer> iterator = ts.iterator();
//        System.out.print("1번 반복자 : ");
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " "); // 10 20 30 40 45
//        }
//        System.out.println();
//        System.out.print("2번 반복자 : ");
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " "); // 값 안 나옴. 위에서 썼으므로 이터레이터 다시 대입해야함
//        }


    }
}
