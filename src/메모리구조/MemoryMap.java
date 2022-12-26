package 메모리구조;

public class MemoryMap {
    public static void main(String[] args) {
        String strVal1 = "나희도"; // 얘네는 공간확보를 따로 안하고 문자 자체가 공간임. 컴파일러가 이미 받아놓음.
        String strVal2 = "나희도.";
        String strVal3 = new String("나희도"); // new가 들어가면 heap영역에 메모리 공간을 새로 확보한 것
        if(strVal1 == strVal2) { // 둘의 바라보는 위치(참조하고 있는 주소값)가 같은가? '=='연산자로 문자열 비교는 불가능하다
            System.out.println("strVal1과 strVal3는 참조가 같음");
        } else {
            System.out.println("strVal1과 strVal3는 참조가 다름");
        }
        if(strVal1.equals(strVal3)) { // 문자열의 내용이 같은가? 문자열 비교는 equals
            System.out.println("strVal1과 strVal3는 값이 같음");
        }
    }
}
