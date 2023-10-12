import stanford.karel.*;

public class BeepersWithOmittedCellKarel extends SuperKarel {

    public void run() {
        while (frontIsClear()) {
            putBeepersInRow();
            move();
            if (frontIsClear()) {
                move();
            }
        }
    }

    private void putBeepersInRow() {
        while (frontIsClear()) {
            putBeeper();
            move();
        }
    }
}