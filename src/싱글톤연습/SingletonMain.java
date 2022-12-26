package 싱글톤연습;
// 프로그램 전체에서 단 하나의 객체로 존재
// 장점 : 메모리 절약, 클래스 간의 데이터 공유가 주 목적
public class SingletonMain {
    public static void main(String[] args) {
//        // 이미 내부적으로 객체가 있으므로 메인에서 객체를 만들지 못함
//        // Singleton test = new Singleton();
//
//        // getSingleton 이라는 메소드를 통해 내부에 만들어진 객체 참조사용하는 것
//        Singleton single1 = Singleton.getSingleton();
//        Singleton single2 = Singleton.getSingleton();
//        if(single1 == single2) {
//            System.out.println("같은 싱글톤 객체입니다.");
//        } else {
//            System.out.println("다른 싱글톤 객체입니다.");
//        }
//        System.out.println(single1.id); // 100
//        System.out.println(single1.name); // test
//        System.out.println(single2.id); // 100
//        System.out.println(single2.name); // test
//        single1.id = 200;
//        single1.name = "우영우";
//        System.out.println(single2.id); // 200
//        System.out.println(single2.name); // 우영우

        Test1 test1 = new Test1();
        Test2 test2 = new Test2();
        test1.setInfo("동그라미", 27); // test1의 setinfo를 가져와서 설정했는데
        test2.viewInfo(); // test2의 정보를 불러오면 똑같이 나옴
    }
}
