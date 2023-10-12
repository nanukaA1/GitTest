import stanford.karel.*;

public class BeepersWithOmittedCellKarel extends SuperKarel {

    public void run() {
        while (frontIsClear()) {
            putBeeper();
            move();
            if (frontIsClear()) {
                move();
            }
        }
    }
}