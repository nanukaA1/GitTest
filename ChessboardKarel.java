//import stanford.karel.Karel;
//
//public class assignment1_blu extends Karel{
//
//}
import stanford.karel.*;

public class ChessboardKarel extends SuperKarel {

    public void run() {
        int height = 8; // Set the height of the chessboard
        int width = 8;  // Set the width of the chessboard

        for (int i = 0; i < height; i++) {
            if (i % 2 == 0) {
                placeBeepersInRow(width);
            } else {
                placeBeepersInRowReversed(width);
            }
            moveUp();
        }
    }

    private void placeBeepersInRow(int width) {
        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                putBeeper();
            }
            move();
        }
    }

    private void placeBeepersInRowReversed(int width) {
        for (int i = 0; i < width; i++) {
            if (i % 2 != 0) {
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
