package 문자열다루기;
// 문자열 : 참조 타입
// equals(변수명) : 문자열을 비교함 (대소문자 구분)
// equalsIgnoreCase(변수명) : 문자열을 비교함 (대소문자 구분 안함)
// indexOf(" ") : 문자열에서 특정 문자/문자열이 시작되는 인덱스를 반환 (연속해서 찾지 않는다)
// contains(" ") : 문자열에서 특정 문자열이 포함되어 있는지 확인 (true/false)
// charAt() : 문자열에서 인덱스 위치의 문자를 반환
// replaceAll("현재문자열", "바꿀문자열") : 문자열 중 특정 문자열을 다른 문자열로 변경(특정 문자열 지울 때도 사용)
// replace() : 문자열 중 특정 문자열을 다른 문자열로 변경(특정 문자열 지울 때도 사용)
// substring() : 문자열 중 특정 문자열을 뽑아 낼 때 사용. 오버라이딩데이터
// ex) (5) => 5번 인덱스부터 끝까지 뽑아냄 / (5, 8) => (시작값, 끝값(-1)), 5번~7번(8미만)까지
// toUpperCase() / toLowerCase() : 문자열을 모두 대문자/모두 소문자로 변경
// trim() : 문자열의 앞/뒤 공백을 제거 (회원가입 아이디,전화번호의 공백제거)
// split() : 문자열을 특정 구분자로 분리하는 메소드
// 문자열 포매팅 : String.format()과 System.out.printf()
// String.format() : 서식으로 문자열을 구성해서 결과를 반환하는 메소드 (다른 변수에 집어넣는다)
// System.out.printf() : 서식으로 문자열을 구성해서 결과를 출력하는 메소드
// toCharArray() : 문자열을 문자 배열로 반환
public class StringMain {
    public static void main(String[] args) {
//        String a = "hello";
//        String b = "Hello";
//        System.out.println(a.equals(b)); // a와 b의 문자열의 내용이 같은지 확인
//        System.out.println(a.equalsIgnoreCase(b)); // a와 b의 문자열의 내용이 같은지 확인(대소문자 구분을 안함)
//        System.out.println(a == b); // 참조가 같은지 묻는다.

//        String name = "23:45:56";
//        String[] names = name.split(":");
////        for(String e : names) System.out.println(e); // 여기까지하면 name을 쪼개줌. 23 45 56
//        System.out.println(names[0] + "시" + names[1] + "분" + names[2] + "초");

//        String cnt = "five";
//        String name = String.format("I eat %s apples.", cnt); // 변수에 저장하는 용도로 사용
//        System.out.printf("I eat %s apples.", cnt); // 화면에 출력하는 용도로만 사용
//        System.out.println(name);

        String name = "Seoul City";
        char[] arrName =  name.toCharArray();
        for(int i = 0; i < arrName.length; i++) {
            System.out.println(arrName[i]);
        }
    }
}
