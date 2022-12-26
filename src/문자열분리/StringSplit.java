package 문자열분리;

import java.util.Scanner;
import java.util.StringTokenizer;

// StringTokenizer 클래스 : 특정 구분자로 연결되어 있는 경우,
// 구분자 기준으로 문자열을 자름 (String의 split 메소드와 유사함)
// countTokens() : 꺼내지 않고 남아있는 토큰(잘려져 있는 문자열)의 수
// hasMoreTokens() : 남아있는 토큰이 있는 지 여부 확인
// nextToken() : 토큰을 하나씩 꺼내 옴
public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 ,기준으로 연속 입력 : ");
        String names = sc.nextLine();

        // 값 없이 구분자가 연속으로 와도 인지없이 잘라짐
//        StringTokenizer st = new StringTokenizer(names, ",");
//        String[] nameStr = new String[st.countTokens()];
//        int idx = 0;
//        while(st.hasMoreTokens()) {
//            nameStr[idx++] = st.nextToken();
//        }
//        for(String e : nameStr) {
//            System.out.print(e + " ");
//        }
//        System.out.println();

        // 구분자가 연속으로 오면 값을 인식해서 자름
       String[] nameStr = names.split(",");
        for(int i = 0; i < nameStr.length; i++) {
            System.out.print(i + "번째" + nameStr[i] + " ");
        }
        System.out.println();

        // 값 없이 구분자가 연속으로 와도 인지없이 잘라짐
        StringTokenizer st = new StringTokenizer(names, ",");
        for(int i = 0; st.hasMoreTokens(); i++) {
            System.out.print(i + "번째" + st.nextToken() + " ");
        }
    }
}
