package 배수구하기;
// 7의 배수를 구하고 1줄에 10개씩 출력하기
public class ForEx3 {
    public static void main(String[] args) {
        int cnt = 0; // 출력 횟수를 확인하기 위해서 사용
        for(int i = 1; i < 1000; i++) { // for문은 3개의 실행문으로 만들어져있음
            if(i % 7 == 0) { // i 나누기 7을 해서 나머지가 0인 경우는 7의 배수를 의미함
                System.out.printf("%4d", i); // 7의 배수를 출력하고, 4칸 차지하고 오른쪽 정렬
                // 방법 1
                cnt++; // 7의 배수를 출력하고 cnt를 1증가 시킴
                if(cnt == 10) {
                    System.out.printf("\n"); // 제어용 문자 new line 줄바꿈
                    cnt = 0; // 줄을 바꿨기 때문에 cnt를 0으로 초기화되고 for문 반복
                }
                // 방법 2
                if(1 % 10 == 0) System.out.printf("\n");
            }
            // 방법 3
            if(i % 70 == 0) System.out.printf("\n");
        }
    }
}
