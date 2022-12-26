package 트리셋3;
public class CarComp implements Comparable<CarComp> {
    public String modelName;
    public int modelYear;
    public String color;

    public CarComp(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    // 자기 객체와 들어오는 객체끼리 비교
    // 정렬 조건(modelYear 기준)을 만들어서 넣어줘야 함.
    public int compareTo(CarComp o) {
//        if(this.modelYear == o.modelYear) return 0;
//        else if(this.modelYear < o.modelYear) return -1;
//        else return 1; // 양수의 경우 객체의 자리가 바뀐다.

        // modelName 기준 문자열 정렬
        if(this.modelName.compareTo(o.modelName) == 0) return 0;
        else if(this.modelName.compareTo(o.modelName) < 0) return -1;
        else return 1;
    }
}
