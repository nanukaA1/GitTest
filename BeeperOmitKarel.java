import stanford.karel.*;

public class BeeperOmitKarel extends SuperKarel {

    public void run() {
        while (frontIsClear()) {
            placeBeepersOmitOne();
            move();
        }
        placeBeepersOmitOne();
    }

    private void placeBeepersOmitOne() {
        while (frontIsClear()) {
            putBeeper();
            move();
            if (frontIsClear()) {
                move();
            }
        }
    }
}