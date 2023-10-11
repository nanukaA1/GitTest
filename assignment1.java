import stanford.karel.Karel;

public class assignment1 extends Karel{
	public void run() {
		goToNewspaper();
		pickUpNewspaper();
		returnHome();
	}
	
	private void goToNewspaper() {
		move();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		turnLeft();
	}
	
	private void pickUpNewspaper() {
		move();
		pickBeeper();
	}
	
	private void returnHome() {
		turnLeft();
		turnLeft();
		move();
		move();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
		move();
	}
}
