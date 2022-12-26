package 정적멤버와메소드;
public class Bank {
    private static int count = 0; // 클래스 필드
    private int account; // 계좌
    private String bank;
    Bank(String name, int account) {
        count++; // 클래스가 객체로 몇 번 생성됐는지 확인할 때 사용
        this.bank = name;
        this.account = account;
        System.out.println(name + "은행에 계좌를 " +
                Util.getCurrentDate("yyyy년 MM월 dd일") + "에 개설합니다.");
        System.out.println("잔액은 " + account + "원 입니다.");
    }
    public static int getCount() { // 클래스가 객체로 몇 번 생성됐는지 확인할 때 사용
        return count;
    }
    public void setDeposit(int dep) {
        this.account += dep;
        System.out.println(bank + "은행에 " + dep + "원을 예금했습니다.");
    }
    public void setWithdraw(int with) {
        if(with > account) {
            System.out.println("잔액이 부족합니다.");
        } else {
            account -= with;
        }
    }
    public void viewAccount() {
        System.out.println(bank + "은행의 현재 잔액은 " + account + "원 입니다.");
    }

}
