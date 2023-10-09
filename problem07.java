
import stanford.karel.SuperKarel;

public class problem07 extends SuperKarel{
	public void run(){
		while(frontIsClear()){
			if(noBeepersPresent()){
				putBeeper();
			}
			move();
			}
		}
	}
}
