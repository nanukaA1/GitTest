import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class nim2021 extends GraphicsProgram {
	private ArrayList<GOval> circles;
	private static final int RADIUS = 20;
	private static final int STEP = 10;
	private int player = 0;

	public void run() {
		addCircles();
		addMouseListeners();
	}

	private void addCircles() {
		circles = new ArrayList<>();
		double startingX = getWidth() / 2 - 11 * 2 * RADIUS / 2 - 10 * STEP / 2;
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
		GObject obj = getElementAt(e.getX(), e.getY());
		int num = -1;
		if (circles.size() > 0 && obj == circles.get(circles.size() - 1)) {
			num = 1;
		} else if (circles.size() > 0 && obj == circles.get(circles.size() - 2)) {
			num = 2;
		} else if (circles.size() > 0 && obj == circles.get(circles.size() - 3)) {
			num = 3;
		} else {
			return;
		}
		removeCircles(num);
		player = (player + 1) % 2;
		if (circles.size() == 0) {
			add(new GLabel("player" + (player + 1) + " won"), 50, 50);
		}
	}

	private void removeCircles(int num) {
		for (int i = 0; i < num; i++) {
			remove(circles.get(circles.size() - 1));
			circles.remove(circles.size() - 1);
		}
	}
}
