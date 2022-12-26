package 컬렉션FW_벡터;

import java.util.List;
import java.util.Vector;

// Vector는 ArrayList와 동일한 내부 구조를 가지고 있음. 사용 방법 동일함
// 멀티 쓰레드 환경에 대한 동기화 지원 여부에 따른 차이. 동기화 지원하나 성능은 ArrayList가 우수함
public class VectorEx {
    public static void main(String[] args) {
        List<NameCard> list = new Vector<>();
        list.add(new NameCard("우영우", "wyw@gmail.com", "010-1234-5678", "변호사"));
        list.add(new NameCard("동그라미", "dgrm@gmail.com", "010-1231-1678", "친구"));
        list.add(new NameCard("이준호", "ljh@gmail.com", "010-2234-5678", "회사원"));

        for(NameCard e : list) {
            System.out.println("이름 : " + e.name);
            System.out.println("메일 : " + e.mail);
            System.out.println("연락처 : " + e.phone);
            System.out.println("직업 : " + e.jobs);
        }
    }
}
