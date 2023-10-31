import stanford.karel.*;

public class problem11 extends SuperKarel {

    public void run() {
        while (!atUpperRightCorner()) {
            moveAlongWall();
        }
    }

    // Check if Karel is at the upper right corner
    private boolean atUpperRightCorner() {
        return frontIsBlocked() && rightBlocked();
    }

    // Move along the wall until reaching the upper right corner
    private void moveAlongWall() {
        if (frontIsClear()) {
            move();
        } else {
            turnLeft();
        }
    }

 
   

    // Check if there is a wall to the right of Karel
    private boolean rightBlocked() {
        turnRight();
        boolean isBlocked = frontIsBlocked();
        turnLeft(); // Turn back to the original direction
        return isBlocked;
    }
}