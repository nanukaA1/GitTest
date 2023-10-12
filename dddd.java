import stanford.karel.Karel;

public class dddd extends Karel {
	public void run() {
		if(frontIsClear()) {
			while(frontIsClear()) {
				fillOddRow();
				if(frontIsClear()){
					fillEvenRow();
				}
			}
		} else { 
			turnLeft();
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
	}
	
	private void fillOddRow() {
		putBeeper();
		//if(frontIsClear()) {
			move();
		//}
		while(frontIsClear()) {
			move();
			if(frontIsClear()) {
				putBeeper();
				move();
			}
		}
		putBeeperInLastCellIfNumberOfCellsIsOdd();
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
        putBeeperInLastCellIfNumberOfCellsIsOdd();
        returnAndMoveUp();
    }
		
	private void putBeeperInLastCellIfNumberOfCellsIsOdd() {
		turnLeft();
		turnLeft();
		move();
		turnLeft();
		turnLeft();
		if(noBeepersPresent()) {
			move();
			putBeeper();
		} else {
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
		} else {
			turnLeft();
		}
		turnLeft();
		turnLeft();
		turnLeft();
	}
}
