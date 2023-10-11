import stanford.karel.Karel;

public class assignment1_2 extends Karel{
	public void run() {
		//turnLeft();
		while(frontIsClear()) {
			turnLeft();
			while(frontIsClear()) {
				move();
				if(beepersPresent()) {
					turnLeft();
					turnLeft();
				}
			}
			turnLeft();
			turnLeft();
			while(frontIsClear()) {
				if(noBeepersPresent()) {
					putBeeper();
				}
				move();
			}
			if(noBeepersPresent()) {
				putBeeper();
			}
			turnLeft();
			turnLeft();
			while(frontIsClear()) {
				move();
			}
			turnLeft();
			move();
			move();
			move();
			move();
		}	
	}
}
