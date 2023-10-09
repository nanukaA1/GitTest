import stanford.karel.SuperKarel;

public class problem02 extends SuperKarel{
	public void run(){
		for (int i = 0; i < 4; i++){
			move();
		}
//		for (int i = 0; i < 10; i++){
//			pickBeeper();
//		}
		while(beepersPresent()){
			pickBeeper();
		}
		move();
//		for (int i = 0; i < 10; i++){
//			putBeeper();
//		}
		while(beepersInBag()){
			putBeeper();
		}
		move();
	}
}
