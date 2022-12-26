package 트리맵;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

// TreeMap : 이진 트리 기반의 Map 컬렉션
// TreeSet과 차이점 : 키와 값이 저장된 Map.Entry를 저장함
// TreeMap의 기본 동작은 부모키 값과 비교해 작은 것은 왼쪽, 큰 것은 오른쪽에 저장
// Map 인터페이스 타입의 변수에 대입되지만
// TreeMap 클래스 타입으로 대입하는 이유는
// 특정 객체를 찾거나 범위 검색과 관련된 메소드를 사용하기 위함
public class TreeMapMain {
    public static void main(String[] args) {
        TreeMap<Integer, String> score = new TreeMap<>();
        score.put(55, "나희도");
        score.put(50, "고유림");
        score.put(98, "백이진");
        score.put(76, "구자경");
        score.put(99, "우영우");

        System.out.println(score);

        // 내림차순으로 바꾸기
        // 반환 타입이 Map
        NavigableMap<Integer, String> descMap = score.descendingMap();
        // 반환 타입이 Set
        Set<Map.Entry<Integer, String>> descEntrySet = descMap.entrySet();
        for(Map.Entry<Integer, String> entry : descEntrySet) {
            System.out.print(entry.getKey() + "점 " + entry.getValue() + " ");
        }
        System.out.println();
        // Map의 값을 전체 출력하기 위해서는 entrySet() 또는 keySet() 메소드를 사용하면 됨
        // entrySet() : Key와 value의 값이 모두 필요한 경우 사용
        // keySet() : Key의 값만 필요한 경우 사용




//        // Map.Entry<Integer, String> entry = null;
//
//        // firstEntry() : 제일 낮은 Map.Entry 를 반환
//        // entry = score.firstEntry();
//        // System.out.println("가장 낮은 점수 : " + entry.getKey() + "점 " + entry.getValue());
//        System.out.println("가장 낮은 점수 : " +
//                score.firstEntry().getKey() + "점 " +
//                score.firstEntry().getValue());
//
//        // lastEntry() : 제일 높은 Map.Entry 를 반환
//        System.out.println("가장 높은 점수 : " +
//                score.lastEntry().getKey() + "점 " +
//                score.lastEntry().getValue());
//
//        System.out.println("90점 이상 점수 : " +
//                score.higherEntry(90).getKey() + "점 " +
//                score.higherEntry(90).getValue());
//
//        System.out.println("90점 미만 점수 : " +
//                score.lowerEntry(90).getKey() + "점 " +
//                score.lowerEntry(90).getValue());
//
//        System.out.println("97점 또는 바로 아래 점수 : " +
//                score.floorEntry(97).getKey() + "점 " +
//                score.floorEntry(97).getValue());
//
//        System.out.println("95점 또는 바로 위 점수 : " +
//                score.ceilingEntry(95).getKey() + "점 " +
//                score.ceilingEntry(95).getValue());
//
//        // pollFirstEntry() : 제일 낮은 Map.Entry부터 꺼내는 거 반복해서 컬렉션 제거됨
//        while(!score.isEmpty()) {
//            Map.Entry<Integer, String> entry = score.pollFirstEntry(); // 1번만 대입하도록하기 위해 따로 뺀 것
//            System.out.println("값을 꺼내오고 지움 : " +
//                    entry.getKey() + "점 " + entry.getValue());
//        }


    }
}
