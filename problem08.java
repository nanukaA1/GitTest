import stanford.karel.Karel;

public class problem08 extends Karel {
	public void run() {
		move();
		move();
		while(beepersPresent()){
			pickBeeper();
			turnLeft();
			turnLeft();
			move();
			pickBeeper();
			turnLeft();
			turnLeft();
			move();
		}
		while(beepersInBag()){
			putBeeper();
		}
		turnLeft();
		turnLeft();
		move();
		while(beepersPresent()){
			pickBeeper();
		}
		turnLeft();
		turnLeft();
		move();
		move();
		while(beepersInBag()){
			putBeeper();
		}
	}
}
