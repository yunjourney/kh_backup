package Set컬렉션;
// Hashset : 순서 유지 X, 중복 허용 X
// 집합의 기능 사용 : 교집합, 합집합, 차집합
// 합집합 : 양쪽에 있는 모든 요소를 포함 (중복 허용 X)
// 교집합 : 양쪽 모두에 존재하는 요소만 포함 (중복 허용 X)
// 차집합 : 앞의 집합에서 뒤의 집합을 뺌
import java.util.Arrays;
import java.util.HashSet;

public class SetCollection {
    public static void main(String[] args) {
//        String[] str = {"H", "e", "l", "l", "o"};
//        HashSet<String> set = new HashSet<>(Arrays.asList(str));
//        System.out.println(set); // [e, H, l, o]

//        HashSet<String> set = new HashSet<>();
//        set.add("Java");
//        set.add("C");
//        set.add("C++");
//        set.add("Python");
//        set.add("Java");
//        for(String e : set) System.out.println(e + " ");
//        System.out.println(set.size()); // 4. 마지막 추가된 Java가 중복이니 포함 안 됨

//        // 중복 없는 로또 번호 만들기
//        HashSet<Integer> set = new HashSet<>();
//        while(true) {
//            int val = (int)(Math.random() * 45) + 1;
//            set.add(val); // set은 중복된 값을 허용하지 않음
//            if(set.size() == 6) break;
//        }
//        System.out.println(set);

//        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
//        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
//        // s1.addAll(s2); // 합집합 수행 [1, 2, 3, 4, 5, 6, 7, 8, 9]
//        // s1.retainAll(s2); // 교집합 수행 [4, 5, 6]
//        s1.removeAll(s2); // 차집합 수행 [1, 2, 3]
//        System.out.println(s1);

        HashSet<String> set = new HashSet<>();
        set.add("Java"); // 값 추가 하기
        set.add("Python");
        set.add("Kotlin");
        set.addAll(Arrays.asList("JavaScript", "C++", "C#")); // 여러 값 한번에 추가
        set.remove("C#");
        set.removeAll(Arrays.asList("JavaScript", "C++", "C#")); // 여러 값 한번에 삭제
        System.out.println(set);
    }
}
