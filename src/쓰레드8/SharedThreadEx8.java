package 쓰레드8;

public class SharedThreadEx8 {
    private int value = 0;

    public int getValue() {
        return value;
    }
    // synchronized 하면 성능떨어짐 value1 출력 후 텀있고 value2 출력됨
    public synchronized void setValue(int value) {
        this.value = value;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName() + "의 Value : " + this.value + " 입니다.");
    }
}
