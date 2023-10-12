import stanford.karel.*;

public class BeeperPatternKarel extends SuperKarel {

    public void run() {
        int height = getHeight();
        int width = getWidth();
        boolean evenRow = true;

        for (int i = 0; i < height; i++) {
            placeBeepersInRow(width, evenRow);
            moveUp();
            evenRow = !evenRow;
        }
    }

    private void placeBeepersInRow(int width, boolean evenRow) {
        for (int i = 0; i < width; i++) {
            if ((evenRow && i % 2 == 0) || (!evenRow && i % 2 != 0)) {
                putBeeper();
            }
            move();
        }
    }

    private void moveUp() {
        turnAround();
        while (frontIsClear()) {
            move();
        }
        turnLeft();
        if (frontIsClear()) {
            move();
            turnLeft();
        }
    }
}