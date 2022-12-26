package 문자파일입력;

import java.io.FileReader;
import java.io.Reader;

public class ChReadEx {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("src/test.txt");
        int readCharNo;
        char[] cbuf = new char[10];
        String data = "";
        while( true ) {
            readCharNo = reader.read(cbuf);
            if(readCharNo == -1) break;
            data += new String(cbuf, 0, readCharNo);
        }
        System.out.println(data);

        reader.close();
    }
}