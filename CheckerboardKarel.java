import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	private boolean putBeeper = true;
	
	private void placeBeeperAndMove()
	{
		while (true)
		{
			if (putBeeper) {
				putBeeper();
				putBeeper = false;
			} else
				putBeeper = true;
			
			if (frontIsBlocked()) break;
			move();
		}
	}
	
	private void goUpAndDown()
	{
		boolean turnLeft = true;
		
		while (true)
		{
			if (turnLeft) 
				turnLeft();
			else 
				turnRight();
			placeBeeperAndMove();
			turnLeft = (turnLeft == true ? false : true);
			if (turnLeft)
				turnLeft();
			else
				turnRight();
			if (frontIsBlocked()) break;
			move();
		}
	}
	
	public void goLeftAndRight()
	{
		boolean turnLeft = true;
		
		while (true)
		{
			placeBeeperAndMove();
			if (turnLeft) 
				turnLeft();
			else 
				turnRight();
			if (frontIsBlocked()) break;
			move();
			if (turnLeft)
				turnLeft();
			else
				turnRight();
			turnLeft = (turnLeft == true ? false : true);
		}
	}
	
	// You fill in this part
	public void run()
	{
		// go up and down 
		//goUpAndDown();
		// go left and right
		goLeftAndRight();
	}
}