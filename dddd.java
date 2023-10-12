import stanford.karel.Karel;

public class dddd extends Karel {
	public void run() {
		fillEvenRow();
		returnAndMoveUp();
	}
	private void fillEvenRow() {
		while(frontIsClear()) {
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
		}
		putBeeperInLastCellIfNumberofCellsIsOdd();
		//returnAndMoveUp();
	}
	
	private void putBeeperInLastCellIfNumberofCellsIsOdd() {
		turnLeft();
		turnLeft();
		move();
		if(noBeepersPresent()) {
			turnLeft();
			turnLeft();
			move();
			putBeeper();
		} else {
			turnLeft();
			turnLeft();
			move();
		}
	}
	
	private void returnAndMoveUp() {
		turnLeft();
		turnLeft();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
		turnLeft();
		turnLeft();
	}
}
