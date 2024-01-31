import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class spaceRocks extends GraphicsProgram{
	private static final int NUM_ROCKS = 8;     
	private static final int ROCK_DIAMETER = 80;  
	private static final int ROCK_SPACING = 20;
	public void run(){
		setSize(ROCK_DIAMETER * 7 + ROCK_SPACING * 7,ROCK_DIAMETER);
		addRocks();
	}

	private void addRocks() {
		double x = 0;
		double y = 0;
		for(int i = 0; i < 7;i++){
			GOval rock = new GOval(ROCK_DIAMETER, ROCK_DIAMETER);
			x = ROCK_DIAMETER * i + ROCK_SPACING * i;
			add(rock,x,y);
		}
	}
}
