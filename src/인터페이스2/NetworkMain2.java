package 인터페이스2;

import java.util.Scanner;

public class NetworkMain2 {
    public static void main(String[] args) {
        NetworkAdapter adapter;
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크 선택 [1]LAN [2]WiFi [3]5G : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 :
                adapter = new LAN("KT MegaPass", "우영우");
                adapter.connect();
                ((LAN) adapter).sendMsg(); // 타입캐스팅 형 변환 또는 다른 인터페이스 만들어서 호출
                ((LAN) adapter).rcvMsg();
                break;
            case 2 :
                adapter = new WiFi("SK Telecom", "이준호");
                adapter.connect();
                ((WiFi) adapter).sendMsg();
                ((WiFi) adapter).rcvMsg();
                break;
            case 3 :
                adapter = new FiveG("LG U+");
                adapter.connect();
                break;
            default :
                System.out.println("네트워크 선택이 잘못되었습니다.");
        }
    }
}
