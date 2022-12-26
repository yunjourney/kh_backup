package 쓰레드5;
// wait() : 해당 스레드를 일시정지 상태로 만듦
// notify() : 일시정지에 있는 다른 스레드를 실행 대기 상태로 만듦
// notifyAll() : wait()에 의해 일시정지된 모든 스레드를 실행 대기 상태로 만듦
public class ThreadMainEx5 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();
        ThreadA threadA = new ThreadA(sharedObject);
        ThreadB threadB = new ThreadB(sharedObject);
        threadA.start();
        threadB.start();
    }
}
