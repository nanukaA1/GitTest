import stanford.karel.SuperKarel;

public class problem04 extends SuperKarel {
	public void run(){
		putBeeper();
		while(frontIsClear()){
			move();
			putBeeper();
		}
	}
}
