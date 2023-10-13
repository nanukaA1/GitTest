import stanford.karel.*;

public class assignment1_4 extends SuperKarel {
	public void run(){
		while(frontIsClear()) {
			move();
			putBeeper();
		}
		pickBeeper();
		turnLeft();
		turnLeft();
		move();
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
}

