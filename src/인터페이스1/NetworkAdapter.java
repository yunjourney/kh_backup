package 인터페이스1;

public interface NetworkAdapter {
    void connect(); // 앞에 public abstract 키워드 생략돼도 추상메소드 가능
}
class LAN implements NetworkAdapter {
    String company;
    LAN(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " LAN에 연결되었습니다.");
    }
}
class WiFi implements NetworkAdapter {
    String company;
    WiFi(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " WiFi에 연결되었습니다.");
    }
}
class FiveG implements NetworkAdapter {
    String company;
    FiveG(String company) {
        this.company = company;
    }
    @Override
    public void connect() {
        System.out.println(company + " 5G에 연결되었습니다.");
    }
}
