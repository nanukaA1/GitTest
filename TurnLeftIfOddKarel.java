import stanford.karel.*;

public class TurnLeftIfOddKarel extends SuperKarel {


    public void run() {
        while (frontIsClear()) {
            move();
            if (frontIsBlocked()) {
                turnLeft();
            }
            if (frontIsClear()) {
                move();
            }
        }
    }
}