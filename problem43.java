
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem43 extends GraphicsProgram {
	private GOval circle;
	private int x;
	private int y;

	public void run() {
		addCircle();
		addMouseListeners();
	}
	public void mousePressed(MouseEvent e) {
		if (getElementAt(e.getX(), e.getY()) != null) {
			x = e.getX();
			y = e.getY();
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		if (getElementAt(e.getX(), e.getY()) != null) {
			circle.move(e.getX() - x, e.getY() - y);
			// update values
			x = e.getX();
			y = e.getY();
		}
	}

	private void addCircle() {
		circle = new GOval(50, 50);
		circle.setFilled(true);
		add(circle, getWidth() / 2 - 25, getHeight() / 2 - 25);
	}

}
