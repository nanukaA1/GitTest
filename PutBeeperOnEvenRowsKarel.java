import stanford.karel.*;

public class PutBeeperOnEvenRowsKarel extends SuperKarel {

	 public void run() {
	        move();
	        while (frontIsClear()) {
	            putBeeper();
	            move();
	            if (frontIsClear()) {
	                move();
	            }
	        }
	    }
}      