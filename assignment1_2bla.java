import stanford.karel.Karel;

public class assignment1_2bla extends Karel{
	public void run() {
		while(frontIsClear()){
			turnLeft();
			while(frontIsClear()) {
				if(noBeepersPresent()){
					putBeeper();
				}
				move();
			}
			if(noBeepersPresent()) {
				putBeeper();
			}
			turnLeft();
			turnLeft();
			while(frontIsClear()) {
				move();
			}
			turnLeft();
			while(frontIsClear()) {
				move();
				move();
				move();
				move();
			}
		}	
	}
}