package 파일입출력스트림;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;

// 파일 클래스 : 파일이나 디렉토리를 추상화한 클래스 (가장 많이 사용되는 입출력)
public class FileStreamEx {
    public static void main(String[] args) throws IOException, URISyntaxException {
        // File file = new File("C:\\파일입출력tmp\\문자출력0816_01.txt");

        // 파일 경로만 지정하면 해당 디렉토리에 포함된 목록을 보여줌
        File dir = new File("C:/파일입출력tmp");
        File file1 = new File("C:/파일입출력tmp/문자출력0816_01.txt");
        File file2 = new File(new URI("file:///C:/파일입출력tmp/문자출력0816_01.txt"));

        if(!dir.exists()) dir.mkdirs(); // 폴더 생성하는 메소드(mkdirs)
        if(!file1.exists()) file1.createNewFile(); // 파일 생성하는 메소드(createNewFile)
        if(!file1.exists()) file2.createNewFile();

        File tmp = new File("C:/파일입출력tmp");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        File[] contents = tmp.listFiles();
        System.out.println("    날짜       시간      크기       이름");
        System.out.println("----------------------------------------------");
        for(File file : contents) {
            System.out.print(sdf.format(new Date(file.lastModified()))); // 파일의 최종 갱신 시간
            if(file.isDirectory()) {
                System.out.print("\t<DIR>\t" + file.getName()); // 파일 이름을 스트링으로 반환
            } else {
                System.out.print("\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }
}
