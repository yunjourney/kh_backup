package 컬렉션FW_어레이리스트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 배열의 확장판, 자바에서 리스트 구조의 컬렉션 프레임워크의 기본 자료 구조
public class ArrayListMain {
    public static void main(String[] args) {
//        // ArrayList<String> pitches = new ArrayList<>(); // 자식클래스의 참조변수로 보는 것
//        List<String> pitches = new ArrayList<>(); // 부모클래스의 참조변수. 이게 더 유연성 굿.
//
//        // 리스트에 값을 추가
//        pitches.add("127");
//        pitches.add("142");
//        pitches.add("155");
//
//        // 리스트의 해당 인덱스에 값을 삽입
//        pitches.add(0, "130");
//
//        // 특정 위치의 값을 가져올 때 get(인덱스)
//        System.out.println(pitches.get(1)); // 127
//
//        // 리스트의 사이즈 확인 size()
//        System.out.println(pitches.size()); // 4
//
//        // 리스트 내에 해당 항목이 있는 지 확인 contains(값) -> (true/false)
//        System.out.println(pitches.contains("142")); // true
//
//        // 해당 인덱스의 항목을 삭제하고 삭제된 값을 반환, remove(인덱스)
//        System.out.println(pitches.remove(0)); // 130
//
//        // 해당 인덱스의 값을 변수에 저장
//        String val1 = pitches.get(0);


        String[]data = {"161", "111", "133", "124", "138", "145", "155"};

        //Arrays.asList(배열) : 이미 만들어져 있는 배열로 ArrayList를 만ㄷ름
        List<String> pitches = new ArrayList<>(Arrays.asList(data));

        // 배열을 앞에서 안 만들고 직접 값을 대입하는 경우
        // List<String> pitches = new ArrayList<>(Arrays.asList("124", "138", "145", "155"));

        // join() : 구분자를 이용해서 문자열을 만들어줌
        String result = String.join(",", pitches);
        System.out.println(result); // 161,111,133,124,138,145,155

        // 리스트 오름차순 정렬 : Comparator.naturalOrder()
        pitches.sort(Comparator.naturalOrder());
        System.out.println(pitches); // [111, 124, 133, 138, 145, 155, 161]

        // 리스트 내림차순 정렬 : Comparator.reverseOrder()
        pitches.sort(Comparator.reverseOrder());
        System.out.println(pitches); // [161, 155, 145, 138, 133, 124, 111]
    }
}
