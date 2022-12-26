package 메소드연습2;
// 메소드 호출 연습과 재귀 호출
public class MethodEx2 {
    public static void main(String[] args) {
        System.out.println(MethodEx2.whileSum(10)); // 원래는 클래스명을 붙여야하는데
        System.out.println(forSum(10)); // static이 붙은 같은 클래스 소속의 메소드기 때문에 클래스명 생략 가능
        System.out.println(gausSum(10));
        System.out.println(recuSum(10));
    }
    // 클래스 메소드
    public static int whileSum(int n) { // 클래스 내에 있기때문에 static 붙여서 클래스 소속의 메소드
        int sum = 0;
        while(true) {
            sum += n;
            n--;
            if(n == 0) break;
        }
        return sum;
    }
    public static int forSum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) { // 0은 더하나마나 똑같으니까 i 1부터 시작한거
            sum += i;
        }
        return sum;
    }
    public static int gausSum(int n) { // 가우스 계산법 등차수열
        return n * (n + 1) / 2;
    }
    public static int recuSum(int n) { // 재귀호출(함수 자신이 자신을 호출하는 것) 미로찾기,트리검색,검색알고리즘에서 사용..
        if(n == 0) return 0;
        return n + recuSum(n - 1); // 10-9-8...-0까지 가서 호출만하고. 다시 되돌아 나올 때 더한다
    }

}
