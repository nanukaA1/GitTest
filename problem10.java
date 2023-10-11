import stanford.karel.SuperKarel;

public class problem10 extends SuperKarel {
	public void run(){
		move();
		while(beepersPresent()) {
			move();
			while(beepersPresent()){
				pickBeeper();
				backUpBeeper();
				moveBack();
				pickBeeper();
				backUpBeeper();
				move();
			}
			restoreBeepers();
			putBeeperOneCellAway();
			moveBack();
		}
		restoreBeepers();
	}
	
	private void moveBack() {
		turnAround();
		move();
		
	}
}
