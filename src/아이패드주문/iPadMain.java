package 아이패드주문;

public class iPadMain {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            IPad iPad = new IPad("iPad Pro");
            if(!iPad.isBuy()) break;
            iPad.setScreen();
            iPad.setColor();
            iPad.setMemory();
            iPad.setNetwork();
            iPad.setName();
            iPad.setSerial();
            iPad.progressPad();
            iPad.productPad();
        }
    }
}
