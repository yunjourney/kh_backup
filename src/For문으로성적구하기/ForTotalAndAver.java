package For문으로성적구하기;
import java.util.Scanner; // 스캐너를 사용하기위해 import
// 정수 n을 입력 받아서, n의 숫자 만큼의 성적으로 입력받음
// 성적의 총점과 평균을 구하기
public class ForTotalAndAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // new 키워드로 객체를 생성, sc는 참조타입 변수
        int total = 0; // 총점으로 누적하기 위한 변수
        System.out.print("과목 갯수 입력 : ");
        int n = sc.nextInt(); // 스캐너(Scanner=sc)클래스에서 정수를 입력 받는 메소드(nextInt)
        // n의 숫자만큼 반복 수행 (성적을 입력 받기 위해서)
        System.out.print("과목 개수에 대한 성적 입력 : ");
        for(int i = 0; i < n; i++) { // 0에서 부터 n보다 작은 동안
            total += sc.nextInt(); // total = total + sc.nextIn()
        }
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f\n", (double)total/n); // 소수점 2자리에서 반올림, 명시적으로 double(실수형)
    }
}
