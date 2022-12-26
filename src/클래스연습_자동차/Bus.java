package 클래스연습_자동차;

public class Bus extends Car {
    public Bus(String name) {
        this.name = name;
        this.maxSpeed = 150;
        this.fuelEff = 5;
        this.fuelTank = 100;
        this.seatCnt = 20;
    }
    @Override
    void setMode(boolean isMode) {
        if(isMode) fuelTank += 30;
    }
}