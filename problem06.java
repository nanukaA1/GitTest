import stanford.karel.Karel;

public class problem06 extends Karel {
	public void run() {
		move();
		transportSecondCell();
		move();
		transportThirdCell();
	}

	private void transportThirdCell() {
		while (beepersPresent()) {
			pickBeeper();
			move();
			putBeeper();
			turnLeft();
			turnLeft();
			move();
			move();
			turnLeft();
			turnLeft();
		}
	}

	private void transportSecondCell() {
		while (beepersPresent()) {
			pickBeeper();
			move();
			move();
			putBeeper();
			turnLeft();
			turnLeft();
			move();
			move();
			turnLeft();
			turnLeft();
		}
	}
}