package 스트링버퍼;
// StringBuffer() : 문자열을 추가하거나 변경할 때 사용
// StringBuilder()
// delete(시작인덱스, 끝인덱스) : 전달된 인덱스의 문자열을 제거
// insert(인덱스, "추가할 문자열") : 문자열 삽입
// substring() :
public class StringBufferMain {
    public static void main(String[] args) {
        // 한 번 만든 객체의 이전 값을 바꿔가면서 만듦. 긴 문자를 만들 때 유리. 뮤터블?. 멀티 쓰레드용
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("Java");
        sb.append("^^");
        System.out.println(sb);

        // 스트링버퍼랑 사용방법 똑같음. 성능이 우수하지만 싱글 쓰레드용
        StringBuilder sbr = new StringBuilder();
        sb.append("hello");
        sb.append(" ");
        sb.append("Java");
        sb.append("^^");
        sb.delete(0, 5); // 시작 인덱스에서 끝 인덱스의 미만까지 삭제
        sb.insert(0, "Hi^^");
        System.out.println(sb);
        System.out.println(sb.substring(0, 8)); // 문자열 자르기

        // 이전 객체를 수정하지 않고 계속 추가해서 새로 만드는 것. 짧은 문자를 만들 때 유리. 이뮤터블?
        String buff = "";
        buff = "hello";
        buff += " ";
        buff += "Java";
        buff += "^^";
        System.out.println(buff);


    }
}
