import stanford.karel.*;

public class PutBeeperOnEvenRowsKarel extends SuperKarel {

    public void run() {
        while (frontIsClear()) {
            putBeeper(); // Put a beeper on the current row
            move();
            if (frontIsClear()) {
                move();
            }
        }
    }
}      