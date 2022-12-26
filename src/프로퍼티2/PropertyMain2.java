package 프로퍼티2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

public class PropertyMain2 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("timeout", "30");
        properties.setProperty("language", "kr");
        properties.setProperty("size", "10");
        properties.setProperty("capacity", "10");

//        // properties에 저장된 요소들은 Enumeration을 이용해 출력 (Iterator와 동일하나 과거문법)
//        Enumeration enumeration = properties.propertyNames();
//        while(enumeration.hasMoreElements()) {
//            String element = (String) enumeration.nextElement();
//            // Enumeration을 통해서 key를 찾아내고 이를 getProperty(키)로 값 출력
//            System.out.println(element + " = " + properties.getProperty(element));
//        }
        // key를 모를 때 순회해서 읽는 방법?
        Iterator<String> iterator = (Iterator<String>) properties.propertyNames();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element + " = " + properties.getProperty(element));
        }
        // 종료되도 설정을 불러와야할 때 쓴다
        System.out.println("Size = " + properties.getProperty("size"));
        System.out.println("capacity = " + properties.getProperty("capacity"));
        System.out.println("language = " + properties.getProperty("language"));
        System.out.println("timeout = " + properties.getProperty("timeout"));


    }
}
