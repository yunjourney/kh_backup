package 프로퍼티;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

// 프로퍼티 : 키와 값이 String 타입으로 제한된 Map 컬렉션
// 주로 설정 정보를 읽는 용도로 사용됨
public class PropertiesMain {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        // 현재 클래스에서 database.propertie 파일의 경로 정보를 가져옴
        String path = PropertiesMain.class
                .getResource("./database.properties") // ./ = 내가 있는 현재 위치, ../ = 현위치에서 상위 폴더
                .getPath();
        path = URLDecoder.decode(path, "utf-8"); // 한글에 대한 정보를 읽어 오기 위해서 사용
        properties.load(new FileReader(path)); // 해당 경로에서 해당 파일을 읽어 들임
        String driver = properties.getProperty("driver"); // 문자열의 키값으로 문자열의 값을 읽음
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("drive : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
