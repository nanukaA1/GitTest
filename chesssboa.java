import stanford.karel.Karel;

public class chesssboa extends Karel {
	public void run() {
		putBeeper();
		while(frontIsClear()) {
		if(frontIsClear()) {
			move();
		}
		while(frontIsClear()) {
			move();
			if(frontIsClear()) {
				putBeeper();
				move();
			}
		}
		turnLeft();
		if(leftIsBlocked()) {
			turnLeft();
			turnLeft();
			move();
			turnLeft();
			turnLeft();
			turnLeft();
		} else {
			move();
			turnLeft();
		}
	}
	}
}
