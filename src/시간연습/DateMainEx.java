package 시간연습;

import java.text.SimpleDateFormat;
import java.util.Date;

// Date 클래스 : 1970년 1월 1일 0시 0분 0초 기준의 msec(1000분의 1초)단위의 경과 시간을 운영체제로부터 얻어냄
// SimpleDateFormat() : 날짜를 원하는 포맷으로 파싱(패턴 매칭) 이후 반환
public class DateMainEx {
    public static void main(String[] args) {
        Date date = new Date();
        // yyyy : 연도를 4자리로 표현
        // yy : 연도 2자리
        // MM : 월 표시, 반드시 대문자(minute 소문자)
        // dd : 일 표시
        // HH : 24시간제
        // hh : 12시간제
        // mm : 분
        // ss : 초
        // w : 몇번째 주 week 의미
        // SimpleDateFormat sdf = new SimpleDateFormat("");
        SimpleDateFormat f1, f2, f3, f4, f5, f6;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년 MM월 dd일");
        f4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        f5 = new SimpleDateFormat("hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 w번째 주, d번째 날입니다.");

        System.out.println(f1.format(date));
        System.out.println(f2.format(date));
        System.out.println(f3.format(date));
        System.out.println(f4.format(date));
        System.out.println(f5.format(date));
        System.out.println(f6.format(date));
    }
}
