import stanford.karel.Karel;

public class chesssboa extends Karel {
	public void run() {
		if(frontIsClear()) {
			while(frontIsClear()) {
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
				if(facingWest()) {
					turnLeft();
					turnLeft();
					turnLeft();
					if(frontIsClear()) {
						move();
						turnLeft();
						turnLeft();
						turnLeft();
					}
				} else {
					turnLeft();
					if(frontIsClear()) {
						move();
						turnLeft();
					}
				}
			} 
		} else {
			putBeeper();
			turnLeft();
			while(frontIsClear()) {
				move();
				if(frontIsClear()) {
					putBeeper();
					move();
				}
		}
	}
}
