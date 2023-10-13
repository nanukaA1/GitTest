import stanford.karel.*;

public class assignment1_4 extends SuperKarel {
	public void run(){
		putBeepers();
		while(beepersPresent()) {
			pickBeepersAtEdges();
		}
		turnLeft();
		turnLeft();
		move();
		putBeeper();
	}
	
	private void pickBeepersAtEdges() {
		while(beepersPresent()){
	         move();
	    }
		turnLeft();
		turnLeft();
		move();
	    pickBeeper();
	    move();
	}
	
	private void putBeepers() {
		while(frontIsClear()) {
			move();
			putBeeper();
		}
		pickBeeper();
		turnLeft();
		turnLeft();
		move();
	}
}

