import stanford.karel.*;

public class BeepersWithOmittedCellKarel extends SuperKarel {

    public void run() {
        putBeeper();
        while (frontIsClear()) {
            move();
            putBeeper();
            if (frontIsClear()) {
                move();
                putBeeper();
            }
            if (frontIsClear()) {
                move();
            }
        }
    }
}