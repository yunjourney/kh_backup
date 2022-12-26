package 해시맵;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 해시맵 : 키와 값으로 구성된 자료구조
// 해시 : 검색과 저장에 아주 우수한 성능을 가짐
// 해시코드 : heap영역에 저장된 인스턴스에 대한 참조 값
// 해시함수 : 고정된 길이를 가진 데이터(배열?)로 매핑해주는 함수
// 해시충돌 : 해시테이블에 중복으로 값이 저장되는 경우를 말함.
// 이 경우 체이닝 기법 등등 사용함.(충돌된 값 끼리 Linked List로 연결함)
public class HashMainEx1 {
    public static void main(String[] args) {
        // Map 컬렉션 생성 : Map<키, 값> map = new HashMap<키, 값 생략O>();
        Map<String, Integer> map = new HashMap<>();

        // 객체에 값 추가 : put(키, 값)
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("이준호", 80);
        map.put("권민우", 93);
        map.put("동그라미", 80); // map은 키에 대한 중복 허용을 하지 않기 때문에 나중 값으로 대체됨
        System.out.println("총 Entry 수 : " + map.size()); // 총 Entry 수 : 4

        // 객체 찾기 : 주어진 키의 값을 반환함
        System.out.println(map.get("동그라미")); // 80

        // keyset() : 모든 키를 Set 객체에 담아서 반환함
        // Iterator를 이용해 값을 읽어 오는 방법
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()) { // 다음 요소가 있는지 확인(있으면 true)
            String key = iterator.next(); // 다음 요소의 키를 가져옴
            Integer value = map.get(key); // 키로 값을 읽어옴
            System.out.println("키 : " + key);
            System.out.println("값 : " + value);
        }
        System.out.println();

        // 향상된 for문 사용. iterator와 동일한 값 출력
        for(String e : map.keySet()) { // Map.Entry에서 키를 뽑아내서 Set에 담음
            System.out.println("키 : " + e);
            System.out.println("값 : " + map.get(e)); // 키 값을 넣어서 값을 반환 받음
        }

        // 객체 삭제 : remove(키), 키로 해당 Map.Entry 제거
        map.remove("권민우");
        System.out.println("총 Entry 수 : " + map.size()); // 3
        System.out.println();

        // 객체 수정 : replace(키, 값)
        map.replace("이준호", 91);

        // 키와 값이 쌍으로 구성된 Map.Entry 객체를 set에 담아서 처리 (추천하지 않는 방법)
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("키 : " + key);
            System.out.println("값 : " + value);
        }
        System.out.println();

        // 객체 전체 삭제 : 모든 Map.Entry를 삭제
        map.clear();
        System.out.println("총 Entry 수 : " + map.size());
    }
}
