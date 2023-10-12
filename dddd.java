import stanford.karel.Karel;

public class dddd extends Karel {
	public void run() {
		if(frontIsClear()) {
			while(frontIsClear()) {
				fillOddRow();
				turnLeft();
				turnLeft();
				turnLeft();
				if(frontIsClear()){
					fillEvenRow();
				}
				turnLeft();
				turnLeft();
				turnLeft();
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
		} //else {
			//turnLeft();
		//}
//		turnLeft();
//		turnLeft();
//		turnLeft();
	}
}
