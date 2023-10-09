import stanford.karel.SuperKarel;

public class problem08seminari extends SuperKarel{
	public void run(){
		doubleMove();
		while(beepersPresent()){
			pickBeeper();
			moveBack();
			pickBeeper();
			move();
		}
		moveBack();
		copy();
		moveBack();
	}

	private void copy() {
		while(beepersPresent()){
			pickBeeper();
			doubleMove();
			putBeeper();
			moveBack();
			moveBack();
		}
	}

	private void moveBack() {
		turnAround();
		move();
		turnAround();
	}

	private void doubleMove() {
		move();
		move();
	}
}