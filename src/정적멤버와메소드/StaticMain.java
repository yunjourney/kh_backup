package 정적멤버와메소드;
import static 정적멤버와메소드.Util.DomainName;

public class StaticMain {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinhan = new Bank("신한", 1000);
        Bank nh = new Bank("농협", 500);
        System.out.println("은행 계좌가 " + Bank.getCount() + "개 생성되었습니다.");
        kakao.setDeposit(3000);
        kakao.setWithdraw(2000);
        kakao.viewAccount();
        System.out.println(DomainName);
    }
}
