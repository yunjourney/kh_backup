package 알고리즘_단어정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

// 사용자로부터 개수를 입력받음
// 개수만큼의 단어를 입력
// 길이가 짧은 것 부터, 길이가 같으면 사전순, 중복 제거
public class WordSortMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 사용자로부터 단어의 개수 입력받음
        String[] word = new String[n]; // 갯수만큼 배열 생성
        sc.nextLine(); // 버퍼 비우기 (개행 문자가 다음 입력값으로 들어가는 것 방지)
        for(int i = 0; i < word.length; i++) {
            word[i] = sc.nextLine(); // 엔터키 기준으로 입력 받기 위해 nextLine() 사용
        }
        // set 컬렉션 프레임워크 : 순서 보장하지 않음, 중복 허용하지 않음
        // asList() : 배열을 컬렉션에 넣을 때 사용하는 메소드
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(word));
        // String[0] : 원래 생성된 배열 크기만큼 넘긴다는 의미
        word = hashSet.toArray(new String[0]);
        // Arrays.sort(word); // 이걸로하면 중복제거되지만 길이 상관없이 사전순으로만 정렬
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2); // 길이가 같으면 사전순 정렬
                } else {
                    return o1.length() - o2.length(); // 만약 앞이 더 길면 양수 반환(정렬조건이 됨)
                }
            }
        });
        System.out.println(Arrays.toString(word));
    }
}
