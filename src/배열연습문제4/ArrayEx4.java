package 배열연습문제4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 로또 번호 자동 생성 :
public class ArrayEx4 {
    public static void main(String[] args) {
        // for문 사용시 중복값 나옴
//        int[] lotto = new int[6];
//        int tmp; // 랜덤으로 생성된 번호를 임시저장
//        for(int i = 0; i < lotto.length; i++) {
//            lotto[i] = (int)((Math.random() * 45) + 1);
//        }
//        System.out.println(Arrays.toString(lotto));

//        int[] lotto = new int[6];
//        int tmp; // 랜덤으로 생성된 번호를 임시저장
//        boolean isExist = false; // 중복된 값이 없다고 초기값 지정.
//        int index = 0; // 중복된 번호가 없는 경우 0부터 채워나감
//        while(true) {
//            tmp = (int)((Math.random() * 45) + 1);
//            for(int i = 0; i < lotto.length; i++) {
//                if(lotto[i] == tmp) isExist = true; // 중복값이 있다.
//            }
//            if(!isExist) lotto[index++] = tmp; // 현재 생성된 번호(tmp)가 배열 내에 없으면(!isExist) 배열에 추가. 값이 들어오면 인덱스 1증가
//            if(index == 6) break; // 로또번호가 6개니까 6까지하고 빠져나옴
//            isExist = false; // 중복된 값이 없다.
//        }
//        System.out.println(Arrays.toString(lotto));


        // ArrayList 생성
        List<Integer> lotto = new ArrayList<>();
        int tmp = 0;
        while (true) { // 로또번호가 중복되는 횟수를 알 수 없기 때문에
            // 0 ~ 44까지 45개의 값 생성 후 1을 더해서 (1 ~ 45까지의 값을 만듦)
            tmp = (int) ((Math.random() * 45) + 1);
            // contains(값) : 해당 값이 리스트에 포함되어 있는지 확인
            if (!lotto.contains(tmp)) { // lotto.contains(tmp)==false 보다 !사용하기 (tmp가 리스트에 포함되어 있지 않으면)
                lotto.add(tmp);
            }
            // ArrayList 크기가 6이면 반복문을 끝냄
            if (lotto.size() == 6) break;
        }
        // 향상된 for문으로 결과 출력
        for (Integer e : lotto) System.out.print(e + " ");
    }
}
