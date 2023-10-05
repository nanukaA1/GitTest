
import stanford.karel.SuperKarel;

public class problem07 extends SuperKarel{
	public void run(){
		move();
		move();
		move();
		if(frontIsClear()){
			move();
		} else {
			turnAround();
			move();
		}
	}

}
