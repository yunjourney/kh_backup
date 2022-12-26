package 해시맵메뉴;
// 해시맵에서 사용할 클래스
// 정보저장용으로만 만들 때는 생성자만 만들
public class MenuInfo {
    String name;  // 메뉴 이름
    int price;    // 메뉴 가격
    String group; // 분류
    String desc;  // 설명
    public MenuInfo(String name, int price, String group, String desc) {
        this.name = name;
        this.price = price;
        this.group = group;
        this.desc = desc;
    }

}
