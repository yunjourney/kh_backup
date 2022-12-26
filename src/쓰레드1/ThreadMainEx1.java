package 쓰레드1;
// 상속으로 쓰레드 생성 방법 (class 사용)
public class ThreadMainEx1 {
    public static void main(String[] args) throws InterruptedException {
        // 상속을 통해서 쓰레드 생성
        Thread thread = new CustomThread(); // Thread를 상속한 객체 생성
        thread.start(); // 스레드 시작을 요청함

        // Runnable 인터페이스로 생성
        // Runnable은 작업 내용에 대한 코드는 완성했지만 실제 쓰레드는 아님
        Runnable task = new RunnableThread();
        Thread thread2 = new Thread(task); // 스레드 생성
        thread2.start(); // 스레드 시작을 요청함

//        // 익명의 객체로 쓰레드 생성
//        Runnable task2 = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    int sum = 0;
//                    for (int i = 0; i <= 10; i++) {
//                        Thread.sleep(10);
//                        sum += i;
//                        System.out.println("익명의 스레드 : " + sum);
//                    }
//                    System.out.println("익명의 스레드 합 : " + sum);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//        Thread thread3 = new Thread(task2); // 스레드 생성
//        thread3.start(); // 스레드 시작을 요청함

        // 익명의 객체로 쓰레드 생성 -> 람다 형식으로 변경
        Runnable task2 = () -> {
            try {
                int sum = 0;
                for (int i = 0; i <= 10; i++) {
                    Thread.sleep(10);
                    sum += i;
                    System.out.println("익명의 스레드 : " + sum);
                }
                System.out.println("익명의 스레드 합 : " + sum);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
    }
}


//        int sum = 0;
//        for(int i = 0; i <= 10; i++) {
//            Thread.sleep(10); // 100분의 1초
//            sum += i;
//            System.out.println("메인 쓰레드" + " : " + sum);
//        }
//        System.out.println("메인 쓰레드" + "합 : " + sum);

