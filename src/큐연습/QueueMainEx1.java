package 큐연습;

import java.util.LinkedList;
import java.util.Queue;

// Queue : FIFO(First In First Out) 형태의 자료 구조
// 자바에서 큐는 Linked List를 사용하므로 Linked List import 되어야 함
public class QueueMainEx1 {
    public static void main(String[] args) {
        // LinkedList를 사용하지만 Queue 기능으로 제약을 걸어서 사용함
        // queue는 클래스가 아니고 interface 임.
        Queue<Message> queue = new LinkedList<>();
        // queue에 객체를 넣을 때 offer, 그냥 값을 넣을 때는 add
        queue.offer(new Message("Mail", "우영우"));
        queue.offer(new Message("SMS", "정명석"));
        queue.offer(new Message("Kakao", "최수연"));

        // 비어있는지 검사해서 비어있지 않으면 반복 수행
        while(!queue.isEmpty()) {
            Message msg = queue.poll(); // 메시지 큐에서 한 개의 메시지를 꺼냄
            switch (msg.command) {
                case "Mail" :
                    System.out.println(msg.to + "에게 메일을 보냅니다.");
                    break;
                case "SMS" :
                    System.out.println(msg.to + "에게 문자를 보냅니다.");
                    break;
                case "Kakao" :
                    System.out.println(msg.to + "에게 카톡을 보냅니다.");
                    break;
            }
        }
        System.out.println("더 이상 전송할 메시지가 없습니다.");
    }
}
