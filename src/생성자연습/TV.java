package 생성자연습;

public class TV {
    // 인스턴스 필드, 접근제한자가 private 이면 같은 클래스 내부에서만 접근 가능
    private boolean isON; // 전원 ON(1)/OFF(0)
    private int channel;  // 1 ~ 999
    private int volume;   // 0 ~ 100
    TV() { // 기본 생성자 호출
        isON = false;
        channel = 10;
        volume = 10;
    }
    TV(boolean isON) {
        this.isON = isON;
        channel = 20;
        volume = 20;
    }
    // tv를 켜고 끄는 기능
    public void setON(boolean isON) {
        this.isON = isON; // this는 자신의 객체를 참조하는 변수
        String onOFFStr = (this.isON) ? "ON" : "OFF"; // 삼항연산자를 사용해 true/false로 찍히지않고 원하는 값 나오도록함
        System.out.println("전원이 " + onOFFStr + " 되었습니다.");
    }
    // 채널 설정 기능
    public void setChannel(int cnl) {
        if(cnl > 0 && cnl < 1000) {
            channel = cnl;
            System.out.println("채널을 " + channel + "번으로 설정했습니다.");
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
    // 볼륨 설정 기능
    public void setVolume(int vol) {
        if(vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을 " + volume + "(으)로 설정했습니다.");
        } else {
            System.out.println("볼륨 설정 범위가 아닙니다.");
        }
    }
    public void viewTV() {
        String onOFFStr = (this.isON) ? "ON" : "OFF";
        System.out.println("------ TV 설정 정보 ------");
        System.out.println("전원 : " + onOFFStr);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
    }

}
