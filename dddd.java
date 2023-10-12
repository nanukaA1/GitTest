import stanford.karel.Karel;

public class dddd extends Karel {
	public void run() {
		fillEvenRow();
		//returnBackAndMoveUp();
	}
	private void fillEvenRow() {
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
		}
	}
}
