package 람다클래스멤버;

public class UsingThis {
    public int outterField = 10;

    class Inner {
        int innerField = 20;
        void method() {
            int localVal = 30;
            //localVal = 40;
            MyFuncInterface mi = () -> {
                System.out.println("외부 필드 : " + outterField);
                System.out.println("외부 필드 " + UsingThis.this.outterField + "\n");

                System.out.println("내부 필드 : " + innerField);
                System.out.println("내부 필드 : " + this.innerField + "\n");

                System.out.println("지역 변수 : " + localVal);
            };
            mi.method();
        }
    }
}