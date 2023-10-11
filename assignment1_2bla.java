import stanford.karel.Karel;

public class assignment1_2bla extends Karel{
	public void run() {
		turnLeft();
		while(frontIsClear()) {
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
		}
	}
}
