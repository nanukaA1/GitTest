import stanford.karel.SuperKarel;

public class problem02 extends SuperKarel{
	public void run() {
		for(int i=0; i<4; i++){
			move();
		}
		while(beepersPresent()){
			pickBeeper();
		}
		move();
		move();
		while(beepersInBag()){
			putBeeper();
		}
	}

}
