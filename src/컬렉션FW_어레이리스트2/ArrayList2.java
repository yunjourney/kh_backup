package 컬렉션FW_어레이리스트2;

import java.util.ArrayList;
import java.util.List;

// 클래스를 ArrayList 로 구성
public class ArrayList2 {
    public static void main(String[] args) {
        List<MenuInfo> menuList = new ArrayList<>();
        menuList.add(new MenuInfo("Americano", 2000, "Coffee", "에스프레소+물", true));
        menuList.add(new MenuInfo("Latte", 4000, "Coffee", "에스프레소+우유", true));
        menuList.add(new MenuInfo("Black Tea", 3000, "Tea", "홍차", false));
        for(MenuInfo e : menuList) {
            System.out.println(e.getJsonFormat());
        }
//        for(int i = 0; i < menuList.size(); i++) {
//            System.out.println(menuList.get(i).getJsonFormat());
//        } // 위에 향상된 for문과 같은 결과임
    }
}
