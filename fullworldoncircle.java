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
				turnAround();
				break;
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
				turnAround();
				move();
				turnRight();
				break;
			}
		}
		
	}
	
	private void fillLinefromRight() {
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
				move();
			} else {
				turnAround();
				move();
				break;
			}
		}
	}
	
	private void goDown() {
		turnRight();
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
				move();
			} else {
				turnAround();
				move();
				break;
			}
		}
	}
}	
	