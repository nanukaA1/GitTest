import stanford.karel.Karel;

public class problem05 extends Karel{
	public void run() {
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