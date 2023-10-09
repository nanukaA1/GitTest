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
				break;
			}
			
		}
		
	}
	
	private void goUp() {
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
	
	private void fillLinefromRight() {
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
	