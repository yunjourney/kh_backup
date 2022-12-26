package 실습1_텍스트파일읽기;

import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;

public class TextFileExMain {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("C:/0819실습예제/0819텍스트파일읽기.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        InputStreamReader isr = new InputStreamReader(inputStream);
        Scanner sc = new Scanner(isr);
        String str;
        String[] sArr;

        TreeSet<StudentInfo> studentInfo = new TreeSet<>();
        while (sc.hasNextLine()) {
            str = sc.nextLine();
            sArr = str.split(" ");
            studentInfo.add(new StudentInfo(sArr[0],Integer.parseInt(sArr[1]),
                    Integer.parseInt(sArr[2]),Integer.parseInt(sArr[3])));
        }
        for(StudentInfo e : studentInfo) System.out.println("이름: " + e.getName() +
                "   " + "총점: " + (e.getKor() + e.getEng() + e.getMat()));
    }
}
class StudentInfo implements Comparable<StudentInfo>, Serializable {
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public StudentInfo(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    public String getName() {
        return name;
    }
    public int getKor() {
        return kor;
    }
    public int getEng() {
        return eng;
    }
    public int getMat() {
        return mat;
    }
    @Override
    public int compareTo(StudentInfo o) {
        if((this.kor + this.eng + this.mat) == (o.kor + o.eng + o.mat)) return 0;
        else if(this.kor + this.eng + this.mat > (o.kor + o.eng + o.mat)) return -1;
        else return 1;
    }
}
