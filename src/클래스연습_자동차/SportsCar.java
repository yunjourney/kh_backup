package 클래스연습_자동차;

public class SportsCar extends Car {
    public SportsCar(String name) {
        this.name = name;
        this.maxSpeed = 250;
        this.fuelEff = 8;
        this.fuelTank = 30;
        this.seatCnt = 2;
    }
    @Override
    void setMode(boolean isMode) {
        if(isMode) maxSpeed *= 1.2;
    }
}