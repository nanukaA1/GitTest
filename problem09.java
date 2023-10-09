import stanford.karel.SuperKarel;

public class problem09 extends SuperKarel{
	public void run(){
		move();
		while(beepersPresent()) {
			move();
			pickBeeper();
			move();
			putBeeper();
			turnAround();
			move();
			putBeeper();
			move();
			turnAround();
		}
	}

}
