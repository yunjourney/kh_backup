package 반복문에대한제어;
// break와 continue;
public class ForControlEx {
    public static void main(String[] args) {
        // i가 0에서부터 100보다 작은 동안 반복
        for(int i = 0; i < 100; i++) { // 증감연산자 i+=2처럼 원하는대로 가능
            if(i % 2 == 0) continue; // 아래의 문장을 수행하지 않고 반복문으로 되돌아감
            if(i == 67) break; // i값이 짝수인 경우 아예 여기로 내려오지 않으니 break수행 안 함
            System.out.println(i);
        }
    }
}
