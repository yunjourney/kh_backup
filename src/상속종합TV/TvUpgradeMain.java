package 상속종합TV;
// 상속 : ProtoTypeTV로 부터 상속받아서 ProductTV를 만듦
// 오버라이딩 : setChannel을 (ProtoType)499개에서 (ProductTV)999개로 변경 (부모의 메소드를 자식이 재정의)
// 오버로딩 : ProductTV 안에서 setChannel을 오버로딩해서 인터넷 모드를 추가함
// 동일한 메소드를 매개변수의 개수나 타입으로 자동호출함
// super() : Product TV 생성자 호출 시 부모의 생성자를 호출
public class TvUpgradeMain {
    public static void main(String[] args) {
        ProductTV lgTV = new ProductTV("우리집 TV");
        lgTV.setPower(true); // 입력값 따로 없으면 기본값 null, 0 출력
        lgTV.setVolume(45);
        lgTV.setChannel(3, true);
        lgTV.viewTV();
    }
}
