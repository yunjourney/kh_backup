package 손익분기점;

import java.util.Scanner;

// 월드전자에서 생산하는 노트북이 몇 대 팔려야 이익이 발생하는가를 묻는 문제
// 입력 : 고정비용 가변비용 판매단가
// 몇 대를 팔아야 손익분기점을 달성하는가를 묻는 문제
// 손익분기점이 존재하지 않으면 -1
public class BEPEx {
    public static void main(String[] args) {
        // 스캐너 객체를 생성해서 고정비용 가변비용 생산비용을 입력받음
        // 손익분기점을 달성할 수 없으면 -1을 출력하고 끝냄
        // 손익분기점 달성 여부 확인은 반복문 사용 또는 공식 이용
        // 결과 출력은 판매 대수
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int fixCost = sc.nextInt();
        int varCost = sc.nextInt();
        int sellPrice = sc.nextInt();
        if (varCost >= sellPrice) { // 손익분기점을 달성할 수 없는 경우
            System.out.println("-1");
            return; // 굳이 이 이상 수행하지않아도되면 여기서 끝내도 됨
        }
        while (true) {
//            if(fixCost + (varCost * cnt) < sellPrice * cnt) break; // 방법1)생산대수가 커지기때문에 int 범위밖으로 나갈 수 있어서 정확한 답은 아니다.
            if(cnt > fixCost / (sellPrice - varCost)) break; // 방법2)
            cnt++;
        }
//        System.out.println((fixCost / (sellPrice - varCost)) + 1); // 방법3)
        System.out.println(cnt);
    }



//        Scanner sc = new Scanner(System.in);
//        int fCost = sc.nextInt();
//        int rCost = sc.nextInt();
//        int mCost = sc.nextInt();
//        int n = 0;
//        int bep = fCost / ((mCost * n - rCost) / mCost * n);
//        if(bep  );
//        else System.out.println(-1);
//    }
}
