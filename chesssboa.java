import stanford.karel.Karel;

public class chesssboa extends Karel {
	public void run() {
		putBeeper();
		//move();
		while(frontIsClear()) {
			move();
			move();
			if(frontIsClear()) {
				putBeeper();
				move();
			}
		}
	}
}
