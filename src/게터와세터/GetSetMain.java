package 게터와세터;

public class GetSetMain {
    public static void main(String[] args) {
        String[] rateStr = {"", "Auto", "16:9", "4:3"};
        TestTV testTV = new TestTV(false, 11, 20, 2);
        testTV.setPower(true);
        testTV.setChannel(3);
        testTV.setVolume(50);
        testTV.setScreenRate(3);


        // 객체마다 생성됨 달라짐
        System.out.println("전원 : " + testTV.isPower());
        System.out.println("채널 : " + testTV.getChannel());
        System.out.println("볼륨 : " + testTV.getVolume());
        System.out.println("화면비율 : " + rateStr[testTV.getScreenRate()]);
        // 클래스 메소드 유일값
        System.out.println("제조사 : " + TestTV.getCompany());
    }
}
