import stanford.karel.*;

public class BeeperPatternKarel extends SuperKarel {
	public void run() {
		while(frontIsClear()) {
			move();
			move();
			putBeeper();
		}
	}
}