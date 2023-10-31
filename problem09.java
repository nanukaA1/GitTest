import stanford.karel.Karel;

public class problem09 extends Karel {
	public void run() {
		move();
		while (beepersPresent()) {
			pickBeeper();
			move();
			transferBeepers();
		}
	}

	private void transferBeepers() {
		addBeepers();
		moveTwice();
		turnAround();
		returnBeepers();
		for (int i = 0; i < 3; i++) {
			move();
		}
		turnAround();
	}
	
	private void addBeepers() {
		while (beepersPresent()) {
			pickBeeper();
			move();
			putBeeper();
			move();
			putBeeper();
			turnAround();
			moveTwice();
			turnAround();
		}
	}
	
	private void returnBeepers() {
		while (beepersPresent()) {
			pickBeeper();
			moveTwice();
			putBeeper();
			turnAround();
			moveTwice();
			turnAround();
		}
	}
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
	
	private void moveTwice() {
		move();
		move();
	}
}