import stanford.karel.Karel;

public class assignment1_2 extends Karel{
	public void run() {
		turnLeft();
		while(frontIsClear()) {
			move();
			if(beepersPresent()){
				turnLeft();
				turnLeft();
			}
			turnLeft();
			turnLeft();
		}
	}
}
