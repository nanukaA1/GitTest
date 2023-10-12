import stanford.karel.Karel;

public class chesssboa extends Karel {
	public void run() {
		putBeeper();
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
		if(rightIsBlocked()) {
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
