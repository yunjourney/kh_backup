package 파일인풋스트림;

import java.io.FileInputStream;

public class FileInputStreamEx {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/파일인풋스트림/FileInputStreamEx.java");
            int data;
            while ( (data = fis.read() ) != -1 ) {
                System.out.write(data);
            }
            fis.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}