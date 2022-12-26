package 정적멤버와메소드;

import java.text.SimpleDateFormat;
import java.util.Date;
// 자주 사용하는 걸 static 메소드로 만들고 호출해서 사용하면 됨
// util 클래스에 이런 것들 넣어놓고 호출 import해서 사용
// SimpleDateFormat
public class Util {
    public final static String DomainName = "http:://192.168.0.14/index";
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}
