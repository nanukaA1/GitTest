import stanford.karel.*;

public class BeeperOmitKarel extends SuperKarel {

    public void run() {
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
        
        // Return to the starting position
        turnAround();
        while (frontIsClear()) {
            move();
        }
        turnAround();
        
        if (frontIsClear()) {
            move();
            placeBeepersOmitOne();
        }
    }
}