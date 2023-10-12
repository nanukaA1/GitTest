import stanford.karel.Karel;
import stanford.karel.SuperKarel;

public class chesssboa extends SuperKarel {
	public void run() {
		//if(frontIsClear()) {
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
					turnLeft();
					move();
					if(noBeepersPresent()) {
//						turnLeft();
//						turnLeft();
//						turnLeft();
						turnAround();
						move();
						putBeeper();
					}
					turnLeft();
					if(frontIsClear()) {
						move();
						turnLeft();
					}
				}
			} 
//		} else {
//			turnLeft();
//			putBeeper();
//			if(frontIsClear()) {
//				move();
//			}
//			while(frontIsClear()) {
//				move();
//				if(frontIsClear()) {
//					putBeeper();
//					move();
//				}
			//}
		//}
	}
}
