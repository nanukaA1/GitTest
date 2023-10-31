import stanford.karel.SuperKarel;

public class problem10 extends SuperKarel{
	public void run() {
		move();
		while(beepersPresent()) {
			move();
			while(beepersPresent()) {
				pickBeeper();
				backupBeeper();
				moveBack();
				pickBeeper();
				backupBeeper();
				move();
			}
			restoreBeepers();
			putBeeperOneCellAway();
			moveBack();
		}
		restoreBeepers();
	}
	
	
	private void moveBack() {
		turnAround();
		move();
		turnAround();
	}
	

	private void backupBeeper() {
		turnLeft();
		move();
		putBeeper();
		turnAround();
		move();
		turnLeft();
	}
	
	
	//private void putBeeperTwoCellsAway() {
//		move();
//		move();
//		putBeeper();
//		moveBack();
//		moveBack();
//	}

	
	private void putBeeperOneCellAway() {
		move();
		putBeeper();
		moveBack();
	}

	
	private void restoreBeepers() {
		turnLeft();
		move();
		turnAround();
		while(beepersPresent()) {
			pickBeeper();
			putBeeperOneCellAway();
		}
		move();
		turnLeft();
	}
}