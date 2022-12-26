package 문자파일출력;

import java.io.FileWriter;
import java.io.Writer;

public class ChWriteEx {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("src/test.txt");

        String data = "안녕 자바 프로그램";
        writer.write(data);

        writer.flush();
        writer.close();
    }
}