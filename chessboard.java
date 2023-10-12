import stanford.karel.Karel;

public class chessboard extends Karel{
	 public void run() {
		 putBeeper();
		 move();
		 while(frontIsClear()) {
			 move();
			 if(frontIsClear()) {
				 putBeeper();
				 move();
			 }
		 }
		 turnLeft();
		 turnLeft();
		 while(frontIsClear()) {
			 move();
		 }
		 turnLeft();
		 turnLeft();
		 
	 }
}	      