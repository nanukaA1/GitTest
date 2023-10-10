import stanford.karel.Karel;

public class problem03 extends Karel{
	public void run(){
		while(frontIsClear()){
			move();
		}
	}

}
