package 평가1_3;
// 메소드 오버로딩 : 동일한 메소드 이름으로 매개변수의 타입이나 갯수에 따라 다양하게 호출
// 즉, 동일한 이름의 메소드가 여러 개 존재함을 의미함
// 매개변수나 타입이 같고 반환값만 다른 경우는 성립하지 않는다.
public class OverLoading {
    public void test() {}
    public void test(String str) {}
    public void test(int i) {} // 타입이 다르므로 생성가능
    //public void test(String s) {} // [문1] 매개변수의 갯수와 타입이 같아서 안됨. 변수명이 달라도 걸러내지않는다.(2,4가 오류난다)
    public void test(char ch) {}
    public void test(String str, int i) {}
    public void test(int i, String str) {} // [문2?] 매개변수의 순서가 다른 건 가능
    //public void test(int ii) {} // 이미 동일한 갯수와 타입이 있음
    //public int test() {return 0;} // [문3] 매개변수가 같고 리턴형(int/void)이 달라도 불가능

}
