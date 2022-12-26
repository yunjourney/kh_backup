package 클래스연습_자동차;

public class Sedan extends Car {
    public Sedan(String name) {
        this.name = name;
        this.maxSpeed = 200;
        this.fuelEff = 12;
        this.fuelTank = 45;
        this.seatCnt = 4;
    }
    @Override
    void setMode(boolean isMode) {
        if(isMode) seatCnt += 1;
    }
}