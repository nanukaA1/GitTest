import stanford.karel.Karel;

public class chessboard extends Karel{
	public void run(){
		//while(frontIsClear()){
			putBeeper();
			while(frontIsClear()) {
				move();
				move();
				putBeeper();
			}
//			turnLeft();
//			turnLeft();
//			while(frontIsClear()) {
//				move();
//			}
//			turnLeft();
//			turnLeft();
//		}
	}
}
