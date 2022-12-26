package 알고리즘_알파벳찾기;
import java.util.Scanner;
// 문자열을 입력 받아 가장 많이 사용된 알파벳이 무엇인지 출력
// 만약, 가장 많이 사용된 단어가 여러 개인 경우 ? 출력
public class Algo_AlEx {
    public static void main(String[] args) {
        // 단어를 입력 받기 위한 스캐너 객체 생성
        // 가장 많이 등장하는 단어를 찾기 위해 알파벳 수 만큼의 배열 생성(대소문자 구분 안함으로)
        // 입력 받은 단어의 길이 만큼 반복문을 수행하면서 알파벳을 정수로 변환한 인덱스에 값 누적
        // charAt(인덱스) : 문자열에서 해당 인덱스의 문자를 뽑아냄
        // 반복문을 순회하면서 가장 많이 동작한 알파벳 찾기(여러개인 경우 ?)
        // 찾은 결과값이 인덱스값(정수)이므로 문자로 변경 후 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("단어 입력 : ");
        String word = sc.next(); // 스캐너 객체를 이용해 문자열을 입력받음
        int[] alpha = new int[26]; // 알파벳 갯수 만큼 배열
        int max = 0; // 누적했을 때 제일 큰 값
        char result = 0;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a') { // 소문자보다 같거나 크다 = 소문자
                alpha[word.charAt(i) - 'a']++; // 자기 자신값에 대입해서 누적하기 += 1; 해도됨
            } else { // 대문자
                alpha[word.charAt(i) - 'A']++;
            }
        }
        for(int i = 0; i < alpha.length; i++) {
            if(alpha[i] == max) result = '?'; // 가장 많이 등장하는 수가 여러 개 인 경우
            else if (alpha[i] > max) { // 현재 인덱스의 문자 개수가 max 보다 큰 경우
                max = alpha[i];
                result = (char)('A' + i); // 결과를 문자로 출력하기 위해서 인덱스의 정수값을 문자로 변환
            }
        }
        System.out.println(result);
    }
}
