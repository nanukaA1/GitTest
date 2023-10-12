import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class problem13 extends GraphicsProgram{
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT = 200;
	private static final double WINDOW_WIDTH = 200;
	private static final double WINDOW_HEIGHT = 200;
	
	public void run() {
		drawHouse();
	}
	
	private void drawHouse() {
		drawWall();
		drawWindows();
		//drawRoof();
		//drawDoor();
	}
	
	private void drawWall() {
		GRect wall = new GRect(HOUSE_WIDTH, HOUSE_HEIGHT);
		double x = getWidth() /2 - HOUSE_WIDTH;
		double y = getHeight() - HOUSE_HEIGHT;
		add(wall, x, y);
	}
	
	private void drawWindows() {
		for(int i = 0; i<2; i++) {
			double x;
			int y = (int) (getHeight() - HOUSE_HEIGHT + (int) (WINDOW_HEIGHT / 2));
			if(i == 0) {
				x = getWidth() /2 - HOUSE_WIDTH / 2;
			} else {
				x = getWidth() /2 - HOUSE_WIDTH /2 + WINDOW_WIDTH;
			}
			GRect window = new GRect(WINDOW_WIDTH, WINDOW_HEIGHT);
			add(window, x, y);
		}
	}

}
