package 쓰레드6;

import java.util.Scanner;

// 스레드의 안전한 종료 방법 : stop 플래그, interrupt()
// stop flag(t/f) 이용방법
public class ThreadMainEx6 {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();
        runThread.start();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("실행을 중지합니다. (quit/no) : ");
            String isQuit = sc.next();
            if(isQuit.equalsIgnoreCase("quit")) {
                Thread.sleep(1000);
                runThread.setStop(true);
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }
        //Thread.sleep(1000);
        //runThread.setStop(true);
    }
}
