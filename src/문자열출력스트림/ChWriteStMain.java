package 문자열출력스트림;
// Writer : 문자열 기반 출력 스트림의 최상위 추상클래스
// 모든 문자 기반 출력 스트림 클래스는 이 클래스를 상속 받아 만들어짐

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ChWriteStMain {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:/파일입출력tmp/문자출력0816_02.txt");
        // char[] data = "곰돌이사육사".toCharArray(); // 문자열을 문자 배열로 변환 시킴

        // 방법 1. for문 활용
//        for(int i = 0; i < data.length; i++) {
//            writer.write(data[i]); // 해당 인덱스 값을 write
//        }

        // 방법 2. write(char[]) 배열자체를 write
        // writer.write(data);

        String data = "내일은 내일의 태양이 뜬다.";
        writer.write(data); // 스트링 타입에 대한 오버로딩 메소드가 있으므로..

        writer.flush(); // 출력 이후는 버퍼를 비워줘야 함
        writer.close(); // 출력 이후 자원 반납하고 열려 있는 스트림을 닫음
    }
}
