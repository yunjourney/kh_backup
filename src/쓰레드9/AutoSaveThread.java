package 쓰레드9;

public class AutoSaveThread extends Thread {
    public void save() {
        // currentThread().getName() : 현재 쓰레드의 이름을 표시 해줌
        System.out.println(currentThread().getName() + "작업 내용을 저장함.");
    }
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            save();
        }
    }
}
