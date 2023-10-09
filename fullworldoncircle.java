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
		while(frontIsClear() & noBeepersPresent()) {
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
		while(frontIsClear() & noBeepersPresent()) {
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
	private void fillLinefromRight() {
		turnLeft();
		while(frontIsClear() & noBeepersPresent()) {
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
	
	private void goDown() {
		turnLeft();
		while(frontIsClear() & noBeepersPresent()) {
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
}	
	