import stanford.karel.SuperKarel;

public class problem03 extends SuperKarel {
	public void run(){
		putBeeper();
		while(frontIsClear()){
			move();
			putBeeper();
		}
	}
}
