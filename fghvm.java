import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class fghvm extends GraphicsProgram {
	public void run() {
		drawLine();
	}

	private void drawLine() {
		double y = getHeight() /  2;
		double x1 = 0;
		double x2 = getWidth();
		GLine line = new GLine(x1, y, x2, y);
		add(line);
	}
}
