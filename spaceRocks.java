import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class spaceRocks extends GraphicsProgram{
	private static final int NUM_ROCKS = 8;     
	private static final int ROCK_DIAMETER = 80;  
	private static final int ROCK_SPACING = 20;
	public void run(){
		addRocks();
	}

	private void addRocks() {
		double x = 0;
		double y = ROCK_DIAMETER / 2;
		for(int i = 0; i < 7;i++){
			GOval rock = new GOval(ROCK_DIAMETER, ROCK_DIAMETER);
			x = ROCK_DIAMETER * i + ROCK_SPACING * i;
			add(rock,x,y);
		}
	}
}
