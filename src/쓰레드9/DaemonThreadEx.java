package 쓰레드9;
// 데몬쓰레드 : 다른 쓰레드의 작업을 돕는 보조 쓰레드
// 백그라운드 모드에서 돌고 있는 쓰레드를 의미
// setDaemon(true), 단 쓰레드 시작 이전에 해야 함.
// 살아있는 다른 쓰레드가 없으면 자동 종료됨
public class DaemonThreadEx {
    public static void main(String[] args) throws InterruptedException {
        AutoSaveThread auto = new AutoSaveThread();
        auto.setDaemon(true); // 데몬 쓰레드로 만듦
        auto.setName("데몬 쓰레드 : "); // 디버깅을 위해서 스레드 이름을 설정할 수 있음
        auto.start();
        Thread.sleep(10000);
    }
}
