import stanford.karel.Karel;

public class assignment1_3 extends Karel {
	public void run() {
		if(frontIsClear()) {
			while(frontIsClear()) {
				fillOddRow();
				if(frontIsClear()){
					fillEvenRow();
				}
			}
		} else { 
			fillVerticalLine();
		}
	}
	
	private void fillOddRow() {
		putBeeper();
		move();
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
	
	private void fillVerticalLine() {
		turnLeft();
		putBeeper();
		move();
		while(frontIsClear()) {
			move();
			if(frontIsClear()) {
				putBeeper();
				move();
			}
		}
		putBeeperInLastCellIfNumberOfCellsIsOdd();
	}
}
