package 열거형연습;

import java.util.Calendar;
import java.util.Scanner;
import static 열거형연습.Common.*;

// 연관된 상수를 나열해 놓은 것
// 자바의 열거형은 상수값과 타입 체크 기능 추가되어있음
// 직업 : 1. 학생, 2. 회사원, 3. 주부, 4. 무직

// java.lang.enum 에 포함된 메소드임
// values() : 열거체에 있는 모든 상수를 저장한 배열을 생성하여 반환
// valueOf() : 전달된 문자열과 일치하는 해당 열거체 상수를 반환
// ordinal() : 해당 열거체 상수가 몇 번째에 정의 되었는지 인덱스를 반환(0부터 시작)

public class EnumMainEx {
    public static void main(String[] args) {
        Rainbow[] arr = Rainbow.values();
        for(Rainbow rb : arr) {
            System.out.println(rb);
        }
        Rainbow rb = Rainbow.valueOf("GREEN");
        System.out.println(rb);

        int index = Rainbow.YELLOW.ordinal();
        System.out.println(index);
    }
}