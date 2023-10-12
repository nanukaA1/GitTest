import stanford.karel.Karel;

public class dddd extends Karel {
	public void run() {
		while(frontIsClear()) {
			fillOddRow();
			fillEvenRow();
		}	
	}
	private void fillOddRow() {
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
		returnAndMoveUp();
	}
	
	private void fillEvenRow() {
		move();
        while (frontIsClear()) {
            putBeeper();
            move();
            if (frontIsClear()) {
                move();
            }
        }
        putBeeperInLastCellIfNumberofCellsIsOdd();
        returnAndMoveUp();
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
		if(frontIsClear()) {
			move();
		} //else {
//			turnLeft();
//		}
		turnLeft();
		turnLeft();
		turnLeft();
	}
}
