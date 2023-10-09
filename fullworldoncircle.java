import stanford.karel.SuperKarel;

public class fullworldoncircle extends SuperKarel {
	public void run() {
		fillLinefromLeft();
		goUp();
		fillLinefromRight();
		goDown();
	
	}
	
	private void fillLinefromLeft() {
		if(facingSouth()){
			turnLeft();
		}
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
				move();
			} else {
				turnAround();
				move();
				turnAround();
			}
		}
	}
	
	private void goUp() {
		turnLeft();
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
				move();
			} else {
				break;
			}
			turnAround();
			move();
			turnRight();
		}
		
	}
	
	private void fillLinefromRight() {
		turnLeft();
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
				move();
			} else {
				break;
			}
		}
		turnAround();
		move();
		turnRight();
	}
	
	private void goDown() {
		turnLeft();
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
				move();
			} else {
				break;
			}
		}
		turnAround();
		move();
		turnRight();	
	}
}	
	