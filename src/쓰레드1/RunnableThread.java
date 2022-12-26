package 쓰레드1;
// Runnable 인터페이스로 스레드 구현
// 인터페이스 상속을 받았기 때문에 run() 메소드를 반드시 구현해줘야함
public class RunnableThread implements Runnable {
    @Override
    public void run() {
            try {
                int sum = 0;
                for(int i = 0; i <= 10; i++) {
                    Thread.sleep(10);
                    sum += i;
                    System.out.println("Runnable : " + sum);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

