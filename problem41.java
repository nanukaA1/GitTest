
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem41 extends GraphicsProgram {
	private static final int RADIUS = 8;

	public void run() {
		addMouseListeners();
	}

	public void mouseDragged(MouseEvent e) {
		paintCircle(e.getX(), e.getY());
	}
	
	public void mouseClicked(MouseEvent e) {
		paintCircle(e.getX(), e.getY());
	}
	
	private void paintCircle(int centerX, int centerY) {
		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle, centerX - RADIUS, centerY - RADIUS);
	}
}
