import stanford.karel.SuperKarel;

public class fullworldoncircle extends SuperKarel {
	public void run() {
		fillLinefromLeft();
//		goUp();
//		fillLineFromLeft();
//		goDown();
	
	}
	private void fillLinefromLeft() {
		while(frontIsClear()) {
			if(noBeepersPresent()) {
				putBeeper();
				move();
			} else {
				turnAround();
				move();
			}
		}
	}
}	
	