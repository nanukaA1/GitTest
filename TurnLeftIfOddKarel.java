import stanford.karel.*;

public class TurnLeftIfOddKarel extends SuperKarel {

    public void run() {
        putBeeper(); // Place the initial beeper
        while (frontIsClear()) {
            move();
            putBeeper();
        }

        if (beepersPresent()) {
            // The number of cells is odd, so turn left
            turnLeft();
        }
    }
}