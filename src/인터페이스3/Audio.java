package 인터페이스3;

public class Audio implements RemoteControl {
    private int volume; // Audio에 있는 인스턴스필드
    @Override
    public void turnON() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOFF() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) { // RemoteControl=인터페이스이름(=클래스 소속)으로 접근.
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
    void getInfo() {
        System.out.println("오디오 입니다.");
        System.out.println("현재 볼륨은 " + volume + " 입니다.");
    }

    @Override
    public void setMute(boolean mute) {
        if(mute) System.out.println("오디오를 무음 처리합니다.");
        else System.out.println("오디오의 무음 처리를 해제합니다.");
    }
}
