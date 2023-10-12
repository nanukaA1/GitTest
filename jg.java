import stanford.karel.Karel;

public class jg extends Karel {
	public void run() {
		putBeeper();
		if(frontIsClear()) {
			move();
		}
		while(frontIsClear()) {
			move();
			if(frontIsClear()) {
				putBeeper();
				move();
			}
		}
	}
	
}