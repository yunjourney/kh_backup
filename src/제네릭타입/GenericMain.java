package 제네릭타입;

// 컴파일시 강한 타입 체크수행 (형 변환 제거)
public class GenericMain {
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>("고유림");
        Person<Integer> p2 = new Person<>(27);

        Product<String, Integer> pr1 = new Product<>();
        pr1.setName("스마트 TV");
        pr1.setYear(2022);
        System.out.println(pr1.getName());
        System.out.println(pr1.getYear());

        Product<Integer, String> pr2 = new Product<>();
        pr2.setName(12345);
        pr2.setYear("2022년8월5일");
        System.out.println(pr2.getName());
        System.out.println(pr2.getYear());
        // 오버로딩 시 데이터타입이 바뀔 때마다 메소드 따로 만들어줘야하는데
        // 이 방법을 쓰면 하나만 해서 데이터타입만 바꿔써주면 된다?
        // 근데 예외사항없이 내부가 일치하는 하나의 메소드를 여러 데이터타입 처리해야돼서 까다로움
    }
}
// T(타입 변수)는 예약어는 아니고 관례상 사용
// 타입 변수란? 임의의 참조형 타입 (기본형 올 수 없다)
class Person <T> { // T 자리에 String 타입이 들어옴
    public T info;
    Person (T info) {
        this.info = info;
    }
}

class Product <T, M> {
    private T name;
    private M year;

    public T getName() {
        return name;
    }
    public void setName(T name) {
        this.name = name;
    }
    public M getYear() {
        return year;
    }
    public void setYear(M year) {
        this.year = year;
    }
}