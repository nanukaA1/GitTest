import acm.graphics.GLine;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class fghvm extends GraphicsProgram {
	public void run() {
		drawGrid();
	}

	private void drawGrid() {
		addVertical();
		// addHorizontal();
	}

	private void addVertical() {
		double y1 = 0;
		double y2 = getHeight();
		//GLine line = new GLine(x, y1, x, y2);
		for (int i = 0; i < 11; i++) {
			double x = i * getWidth() / 10;
			GLine line = new GLine(x, y1, x, y2);
			add(line);
		}
	}

}