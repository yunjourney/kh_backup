package 람다생성자참조;

public class LambdaMember {
    private String name;
    private String id;

    public LambdaMember() {
        System.out.println("Member() 실행");
    }
    public LambdaMember(String id) {
        System.out.println("Member(String id) 실행");
        this.id = id;
    }
    public LambdaMember(String name, String id) {
        System.out.println("Member(String name, String id)");
        this.name = name;
        this.id = id;
    }

    public String getId() { return id; }
}