import stanford.karel.Karel;

public class chessboard extends Karel{
	 public void run() {
	        putBeeper();
	        move();
	        while (frontIsClear()) {
	            putBeeperIfClear();
	        }
	    }

	    private void putBeeperIfClear() {
	        move();
	        if (frontIsClear()) {
	            putBeeper();
	            move();
	        }
	    }
	}