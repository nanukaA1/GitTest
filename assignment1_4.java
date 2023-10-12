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
			pickBeepersAtEdge();
		}
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		putBeeper();
	}
	
	private void pickBeepersAtEdge() {
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

