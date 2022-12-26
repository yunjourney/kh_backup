package 에어컨만들기;
import java.util.Scanner;
import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException { // *예외처리
        AirCon lgAirCon = new AirCon();
        Scanner sc = new Scanner(System.in);
        int elapsedTime = 0; // 경과시간계산
        boolean isSetTemp = false; // 온도를 변경하는 조건 체크
        System.out.print("에어컨을 켜시겠습니까? (Yes/No)");
        String isON = sc.next();
        if(isON.equalsIgnoreCase("Yes")) {
            lgAirCon.setPower(true);
            lgAirCon.setAirCon();
            while(true) {
                sleep(1000); // 1초(1000m/s)마다 한바퀴씩 돌린다. sleep:스레드를 잠시 잠자게 함 *예외처리필요
                elapsedTime++; // while문 돌때마다 증가해서 경과 시간을 누적함
                switch(lgAirCon.getWindStep()) {
                    case 1 : if(elapsedTime >= 60) isSetTemp = true; break;
                    case 2 : if(elapsedTime >= 30) isSetTemp = true; break;
                    case 3 : if(elapsedTime >= 20) isSetTemp = true; break;
                    default : if(elapsedTime >= 61) isSetTemp = true; break; // 같은 조건이니 디폴트 생략가능. 값 다르면 ㄱㄴ
                }
                if(isSetTemp) {
                    if(lgAirCon.isHeater()) lgAirCon.setCurrTemp(1);
                    if(lgAirCon.isCooler()) lgAirCon.setCurrTemp(-1);
                    lgAirCon.airConInfo();
                    isSetTemp = false; // 다시 초기화
                    elapsedTime = 0;   // 다시 초기화
                }
                if(lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()) {
                    System.out.println("에어컨을 종료합니다.");
                    break;
                }
            }
        }
    }
}
