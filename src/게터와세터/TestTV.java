package 게터와세터;
// 데이터 은닉 특성때문에 나온 개념
// Getter : 인스턴스 필드의 값을 읽기 위한 메소드
// Setter : 인스턴스 필드의 값을 쓰기 위한 메소드
// 필요이유 : 인스턴스 필드에 대한 외부 접근 허용을 막아야 하기 때문에
public class TestTV {
    private final static String company = "LG";
    private boolean isPower;
    int channel;
    private int volume;
    private int screenRate; // 화면 비율 1)Auto, 2)16:9, 3)4:3...

    final static String getCompany() { // static이랑 final은 앞뒤 순서 상관없음
        return company;
    }

    public TestTV(boolean isPower, int channel, int volume, int screenRate) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
        this.screenRate = screenRate;
    }

    public boolean isPower() { // getter
        return isPower;
    }

    public void setPower(boolean power) {
        isPower = power;
    }

    public int getChannel() { // 외부에서 접근 읽음
        return channel;
    }

    public void setChannel(int channel) { // 외부에서 채널을 설정
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getScreenRate() {
        return screenRate;
    }


    public void setScreenRate(int screenRate) {
        this.screenRate = screenRate;
    }
}
