package 문자열입력스트림;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// Reader : 문자 기반 입력 최상위 추상 클래스
// 모든 문자 기반 입력 스트림은 이 클래스를 상속받아서 만들어짐
public class ChReadStMain {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:/파일입출력tmp/문자출력0816_02.txt");
//        int readData;
//        while(true) {
//            readData = reader.read(); // 입력 스트림으로부터 문자(2byte)를 읽고 int 타입으로 반환
//            if(readData == -1) break; // 더 이상 읽을 내용이 없음
//            System.out.print((char)readData); // char 형 변환이 없으면 숫자만 찍힌다
//        }

        int readCharNo; // 읽은 문자의 개수
        char[] cbuf = new char[10]; // 문자 배열을 통해 한번에 10개씩 읽음
        String data = ""; // 초기화 방법 중 하나, 가리키는 주소에 문자열이 없음
        while(true) {
            readCharNo = reader.read(cbuf); // 배열의 크기만큼 읽음
            if(readCharNo == -1) break; // 읽을 문자가 없음을 의미
            data += new String(cbuf, 0, readCharNo); // 시작(0)부터 읽은 문자의 갯수(readCharNo)만큼 생성해서 이어붙여줌
        }
        System.out.println(data);
        reader.close(); // 문자를 읽기 위한 입력 스트림을 닫음
    }
}
