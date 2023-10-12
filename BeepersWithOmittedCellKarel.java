import stanford.karel.*;

public class BeepersWithOmittedCellKarel extends SuperKarel {

    public void run() {
        while (true) {
            putBeeper();
            if (frontIsClear()) {
                move();
                if (frontIsClear()) {
                    move();
                }
            } else {
                break;
            }
        }
    }
}