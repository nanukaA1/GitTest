import java.awt.event.ComponentEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class problem69 extends GraphicsProgram {
	public void run() {
		drawGrid();
	}

	private void drawGrid() {
		for (int i = 0; i < 10; i++) {
			addVerticalLine(i);
			addHorisontalLine(i);
		}
	}

	private void addHorisontalLine(int i) {
		double height = (double) getHeight() / 9;
		double y = i * height;
		double x1 = 0;
		double x2 = getWidth();

		GLine line = new GLine(x1, y, x2, y);
		add(line);
	}

	private void addVerticalLine(int i) {
		double width = (double) getWidth() / 9;
		double x = i * width;
		double y1 = 0;
		double y2 = getHeight();

		GLine line = new GLine(x, y1, x, y2);
		add(line);
	}

	public void componentResized(ComponentEvent e) {
		drawGrid();
	}
}
