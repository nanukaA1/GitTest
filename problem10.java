import stanford.karel.SuperKarel;

public class problem10 extends SuperKarel{
	public void run() {
		move();
		while(beepersPresent()) {
			move();
			while(beepersPresent()) {
				pickBeeper();
				backupBeeper();
				moveBack();
				pickBeeper();
				backupBeeper();
				move();
			}
			restoreBeepers();
			putBeeperOneCellAway();
			moveBack();
		}
		restoreBeepers();
	}
	
	/*
	 * Karel moves 1 move backwards
	 * Pre: Karel at pos: ix1, facing east
	 * Post: Karel at pos: i-1x1, facing east
	 */
	private void moveBack() {
		turnAround();
		move();
		turnAround();
	}
	
	/*
	 * Karel moves 1 beeper from main position to the backup position
	 * Pre: Karel at pos: ix1, facing east, k beepers at ix1, p beepers at ix2
	 * Post: Karel at pos: ix1, facing east, k-1 beepers at ix1, p+1 beepers at ix2
	 */
	private void backupBeeper() {
		turnLeft();
		move();
		putBeeper();
		turnAround();
		move();
		turnLeft();
	}
	
	/*
	 * Karel puts 1 beeper at the cell which is two cells away in the direction he's facing
	 * Pre: Karel at pos: ixj, facing direction x, k beepers at cell which is two cells away (e.g. i+2xj)
	 * Post: Karel at pos: ixj, facing direction x, k+1 beepers at next cell(depending on direction Karel was facing)
	 */
	private void putBeeperTwoCellsAway() {
		move();
		move();
		putBeeper();
		moveBack();
		moveBack();
	}

	/*
	 * Karel puts 1 beeper at the next cell in the direction he's facing
	 * Pre: Karel at pos: ixj, facing direction x, k beepers at next cell(e.g. i+1xj)
	 * Post: Karel at pos: ixj, facing direction x, k+1 beepers at next cell(depending on direction Karel was facing)
	 */
	private void putBeeperOneCellAway() {
		move();
		putBeeper();
		moveBack();
	}

	/*
	 * Karel moves all beepers from backup position to the main position
	 * Pre: Karel at pos: ix1, facing east, 0 beepers at ix1, k beepers at ix2
	 * Post: Karel at pos: ix1, facing east, k beepers at ix1, 0 beepers at ix2
	 */
	private void restoreBeepers() {
		turnLeft();
		move();
		turnAround();
		while(beepersPresent()) {
			pickBeeper();
			putBeeperOneCellAway();
		}
		move();
		turnLeft();
	}
}