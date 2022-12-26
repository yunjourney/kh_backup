package 쓰레드게임만들기;
// 게임 캐릭터를 만들기 위해 기본 클래스 정의
// 게임캐릭터가 가져야 할 필수 요소 포함
// 상속을 주기 위해서 접근제한자는 protected(상속관계, 같은 패키지접근가능)
// abstract 붙인 이유: 추상메소드는 없지만
abstract public class Unit {
    protected String name; // 캐릭터 이름
    protected int pPower; // Physical Power (물리적인 힘)
    protected int mPower; // Magical Power (마법의 힘)
    protected double pHit; // 물리 적중률
    protected double mHit; // 마법 적중률
    protected int ultraPower; // 궁극 (해당 캐릭터가 가진 특수능력)
    protected int hp; // 체력

}
// 실제 기능 구현 없고, 상속 받은 클래스는 반드시 해당 메소드를 완성해줘야 함
// 자바는 상속이 불가능하지만 인터페이스를 이용하여 다중 상속처럼 사용
// 인터페이스 내에 있는 건 abstract 자동으로 붙음
interface GameAction {
    double pAttack(); // 구현부{}가 없고 선언만 있음, 상속받은 클래스가 구현해줘야함
    double mAttack(); // 마법 공격력
    int ultimate(); // 궁극의 기술로 입히는 공격량
    // 반환타입이 boolean인 이유는 캐릭터가 아직 살아 있는지 판별하려고
    // 남아 있는 hp보다 damage가 크면 true를 반환(즉 죽었다는 의미)
    boolean setDamage(double damage); // 피해를 받는 양
}
