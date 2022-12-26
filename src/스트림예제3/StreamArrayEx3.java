package 스트림예제3;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

// 배열로부터 스트림 얻기
// 숫자 범위로부터 스트림 얻기 :
public class StreamArrayEx3 {
    public static void main(String[] args) {
        // 배열로부터 스트림 얻기
//        String[] array = {"이은지", "이영지", "미미", "안유진", "나영석"};
//
//        // 배열에서 스트림 생성
//        Stream<String> stream = Arrays.stream(array);
//        stream.forEach(e->System.out.print(e + " "));
//        System.out.println();
//
//        // 배열의 특정 부분만을 이용한 스트림 생성
//        Stream<String> stream1 = Arrays.stream(array, 1, 3);
//        stream1.forEach(e->System.out.print(e + " "));
//        System.out.println();


        // 숫자 범위로부터 스트림 얻기
        IntStream stream = IntStream.rangeClosed(1, 100);
        AtomicInteger sum = new AtomicInteger();
        stream.forEach(e -> sum.addAndGet(e));
        System.out.println("총합 : " + sum);
    }
}
