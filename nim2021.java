import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class nim2021 extends GraphicsProgram {
	private ArrayList<GOval> circles;
	private static final int RADIUS = 20;
	private static final int STEP = 10;

	public void run() {
		addCircles();
		addMouseListeners();
	}

	private void addCircles() {
		circles = new ArrayList<>();
		double startingX = (getWidth() - 11 * 2 *RADIUS - 10 * 2 * STEP) / 2;
		for (int i = 0; i < 11; i++) {
			GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
			circle.setFilled(true);
			circle.setFillColor(Color.GRAY);
			double x = startingX + i * (STEP + 2 * RADIUS);
			double y = (getHeight() - 2 * RADIUS) / 2;
			add(circle, x, y);
			circles.add(circle);
		}
	}

	public void mouseClicked(MouseEvent e) {

	}
}
