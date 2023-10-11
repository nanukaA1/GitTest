import stanford.karel.Karel;

public class chessboard extends Karel{
	public void run(){
		putBeeper();
		while(frontIsClear()) {
			move();
			move();
			putBeeper();
		}
	}
}
