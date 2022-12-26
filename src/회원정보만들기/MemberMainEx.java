package 회원정보만들기;
public class MemberMainEx {
    public static void main(String[] args) {
        Member member = new Member(); // 클래스명 참조변수(실제정보는 = 뒤에 있는 애들이 갖고있음) = 객체생성자(new) 객체
        member.setName(); // .은 도트 연산자, 내부메소드 접근할 수 있게 해줌
        member.setAge();
        member.setGender();
        member.setJobs();
        member.viewInfo();
    }
}
