package 자기참조변수;
public class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    // 생성자 오버로딩이 많아지면 생성자 간의 중복코드가 발생할 수 있다
    // 생성자를 하나만 만들고 외에는 그 생성자를 호출해서 사용
    // this() 생성자 내에서 다른 생성자를 호출 할 때 사용
    Car(String modelName) { // 간단하게 위의 modelName만 받아서 사용
        this(modelName, 2022, "은색", 250); // 생성자 내부에서만 사용됨. 오버로딩관계가 성립되는 위 생성자를 호출
    }
    Car(String modelName, String color, int maxSpeed) {
        this.modelName = modelName;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    Car() { // 빈 생성자만 불러도 가능
        // this("GV80", 2020, "Black", 230);
        this("GV80", "Black", 230);
    }
    void viewCar() {
        System.out.println("차종 : " + modelName);
        System.out.println("연식 : " + modelYear);
        System.out.println("색상 : " + color);
        System.out.println("속도 : " + maxSpeed);
    }
    void viewCar(boolean notYear) {
        System.out.println("차종 : " + modelName);
        System.out.println("색상 : " + color);
        System.out.println("속도 : " + maxSpeed);
    }
}
