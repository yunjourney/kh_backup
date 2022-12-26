package 상속종합TV;

public class ProductTV extends PrototypeTV {
    String name;
    boolean isInternet; // 인터넷 모드 추가
    ProductTV() {
        // super(false, 3, 30); // 부모의 생성자 호출
    }
    ProductTV(String name) {
        super(false, 3, 30); // 부모 생성자부터 먼저 호출 ( 없으면 null, 0 출력)
        this.name = name; // 그 뒤에 자기자신의 생성자가 나와야함
    }
    void setPower(boolean power) {
        this.isPower = power;
    }
    void setVolume(int vol) {
        if(vol >= 0 && vol <= 100) {
            volume = vol;
        } else {
            System.out.println("볼륨 설정 범위를 벗어났습니다.");
        }
    }
    @Override
    public void setChannel(int cnl) {
        if(cnl > 0 && cnl < 1000) {
            channel = cnl;
            System.out.println("채널을 " + channel + "번으로 변경했습니다.");
        } else {
            System.out.println("채널 설정 범위가 아닙니다.");
        }
    }
    // 메소드 오버로딩 : 동일한 이름의 메소드를 매개변수의 개수나 타입으로 구분
    public void setChannel(int cnl, boolean internet) {
        if(internet) {
            System.out.println("인터넷 모드입니다.");
            isInternet = true;
        } else {
            isInternet = false;
            if(cnl > 0 && cnl < 1000) {
                channel = cnl;
                System.out.println("채널을 " + channel + "번으로 변경했습니다.");
            } else {
                System.out.println("채널 설정 범위가 아닙니다.");
            }
        }
    }
    public void viewTV() {
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + isPower);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷모드 : " + isInternet);
    }
}
