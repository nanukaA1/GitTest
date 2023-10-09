import stanford.karel.SuperKarel;

public class fullworldoncircle extends SuperKarel {
	public void run() {
		//while(frontIsClear()){
			fillLinefromLeft();
			goUp();
			fillLinefromRight();
			goDown();
	//	}
	
	}
	
	private void fillLinefromLeft() {
//		if(facingSouth()){
//			turnLeft();
//		}
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
				move();
			} else {
				turnAround();
				move();
				turnRight();
			}
			break;
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
			turnLeft();
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
		move();
		turnLeft();
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
		move();
		turnLeft();	
	}
}	
	