package 생성자연습;
public class TVEx1 {
    public static void main(String[] args) {
        TV lgTV = new TV();
        lgTV.setON(true);
        lgTV.setChannel(800);
        lgTV.setVolume(56);
        lgTV.viewTV();

        TV samTV = new TV(true);
        samTV.viewTV();
    }
}
