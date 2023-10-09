import stanford.karel.SuperKarel;

public class fullworldoncircle extends SuperKarel {
	public void run() {
		while (true) {
			if (frontIsClear()) {
				putBeeper();
				move();
				if (beepersPresent()) {
					turnAround();
					move();
					turnRight();
					move();
					if (frontIsClear()) {
						move();
						if (beepersPresent()) {
							turnAround();
							move();
							putBeeper();
							turnRight();
							move();
							putBeeper();
							break;
						}
						turnAround();
						move();
						turnAround();
					}
				}
			} else {
				turnLeft();
			}
		}
	}

}
	