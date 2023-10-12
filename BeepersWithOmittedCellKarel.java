import stanford.karel.*;

public class BeepersWithOmittedCellKarel extends SuperKarel {

    public void run() {
        putBeepersEvenRow();
        while (frontIsClear()) {
            move();
            putBeepersOddRow();
            if (frontIsClear()) {
                move();
                putBeepersEvenRow();
            }
        }
    }

    private void putBeepersEvenRow() {
        putBeeper();
        while (frontIsClear()) {
            move();
            if (frontIsClear()) {
                move();
                putBeeper();
            }
        }
    }

    private void putBeepersOddRow() {
        move();
        putBeeper();
        while (frontIsClear()) {
            move();
            if (frontIsClear()) {
                move();
                putBeeper();
            }
        }
    }
}