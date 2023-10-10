import stanford.karel.Karel;

public class problem07 extends Karel{
	public void run() {
		while(leftIsClear()){
			while(frontIsClear()){
				if(noBeepersPresent()){
					putBeeper();
				}
				move();
			}
			if(noBeepersPresent()){
				putBeeper();
			}
			turnLeft();
			move();
			turnLeft();
			while(frontIsClear()){
				move();
			}
			turnLeft();
			turnLeft();
		}
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
		}
		if(noBeepersPresent()){
			putBeeper();
	}
}
}