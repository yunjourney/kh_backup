package 스트림예제2;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

// 스트림은 컬렉션의 요소에 대해 중간 처리와 최종 처리를 수행할 수 있는데
// 중간 처리에서는 매핑, 필터링, 정렬을 수행하고 최종 처리에서는
// 반복, 카운팅, 평균, 총합 등의 처리를 수행
public class StreamEx2 {
    public static void main(String[] args) {
        List<StudentInfo> list = new LinkedList<>();
        list.add(new StudentInfo("미미", 45));
        list.add(new StudentInfo("안유진", 98));
        list.add(new StudentInfo("이영지", 88));
        list.add(new StudentInfo("이은지", 90));
        list.add(new StudentInfo("나영석", 91));

//        Stream<StudentInfo> stream = list.stream();
//        stream.forEach(s->{
//            String name = s.getName();
//            int score = s.getScore();
//            System.out.println(name + ", " + score);
//        });
//
//        // 향상된 for문. 동일한 출력값
//        for(StudentInfo e : list) {
//            String name = e.getName();
//            int score = e.getScore();
//            System.out.println(name + ", " + score);
//        }


        // 순차 처리
//        Stream<StudentInfo> stream = list.stream();
//        stream.forEach(s -> {
//            String name = s.getName();
//            int score = s.getScore();
//            print(String.format(name + ", " + score));
//        });
        // 출력값
//        미미, 45 : main
//        안유진, 98 : main
//        이영지, 88 : main
//        이은지, 90 : main
//        나영석, 91 : main

        // 병렬 처리
//        Stream<StudentInfo> parallelStream = list.parallelStream();
//        parallelStream.forEach(s -> {
//            String name = s.getName();
//            int score = s.getScore();
//            print(String.format(name + ", " + score));
//        });
        // 출력값
//        이영지, 88 : main
//        안유진, 98 : ForkJoinPool.commonPool-worker-3
//        미미, 45 : ForkJoinPool.commonPool-worker-5
//        나영석, 91 : main
//        이은지, 90 : ForkJoinPool.commonPool-worker-3


        // 중간 스트림 만들기 : 스트림을 이용해 평균 구하기
        double avg = list.stream()
                .mapToDouble(StudentInfo::getScore) // 메소드 참조 (클래스명::메소드명)
                .average()
                .getAsDouble();
        System.out.println("평균점수 : " + avg);
    }

//    static void print(String str) {
//        System.out.println(str + " : " + Thread.currentThread().getName());
//    }
}

class StudentInfo {
    private String name;
    private int score;

    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
