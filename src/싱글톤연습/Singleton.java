package 싱글톤연습;
public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton(); // 하나의 객체여야해서 생성자로 호출하면 안되니 private. 더이상 생성X이니 static.
    private Singleton() {
        name = "test";
        id = 100;
    }
    static Singleton getSingleton() {
        return singleton;
    }
}
