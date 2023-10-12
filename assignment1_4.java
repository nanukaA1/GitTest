import stanford.karel.*;
public class assignment1_4 extends SuperKarel {
	public void run(){
		while(frontIsClear()) {
			putBeeper();
			move();
		}
		putBeeper();
		
		turnLeft();
		turnLeft();
		while(beepersPresent()) {
			pickBeepersAtEdge();
		}
		
	}
	
	private void pickBeepersAtEdge() {
		while(beepersPresent()){
	         move();
	    }
		turnLeft();
		turnLeft();
		turnLeft();
		move();
	    pickBeeper();
	    move();
	}
}
////Karel put the first and last beeper
//   putBeeper();
//placeLastBeeper();
////Karel move beepers towards the midle one by one
//while(noBeepersPresent()){
//moveBeeper();
//}
////Karel pick the last beeper and return in to the middle
//pickBeeper();
//turnAround();
//move();
//}
////Karel find the middle
//private void moveBeeper(){ 
//    while(noBeepersPresent()){
//         move();
//    }
//     pickBeeper();
//     turnAround();
//     move();
//     putBeeper();
//     move();
//    }
//private void placeLastBeeper(){
//    while(frontIsClear()){
//         move();
//    }
//     putBeeper();
//     turnAround();
//     move();
//}
