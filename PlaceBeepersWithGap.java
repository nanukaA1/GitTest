import stanford.karel.*;

public class PlaceBeepersWithGap extends SuperKarel {

    public void run() {
        while (frontIsClear()) {
            placeBeeper();
            move();
            if (frontIsClear()) {
                move();
            }
        }
    }

    // Place a beeper if the cell is empty
    private void placeBeeper() {
        if (noBeepersPresent()) {
            putBeeper();
        }
    }
}