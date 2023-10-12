import stanford.karel.Karel;

public class jg extends Karel {
	public void run() {
		while(frontIsClear()) {
			move();
			if(frontIsClear()) {
				turnLeft();
			}
		}
		
	}
	
}