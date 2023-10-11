import stanford.karel.Karel;

public class chessboard extends Karel{
	public void run(){
		while(frontIsClear()) {
			putBeeper();
			if(frontIsClear()){
				move();
			}
		}
	}
}
