import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem41 extends GraphicsProgram {
	public void run() {
		addMouseListeners();
		getMouseMotionListeners();
	}

	public void mouseDragged(MouseEvent e) {
		GOval dot = new GOval(2, 2);
		dot.setFilled(true);
		add(dot, e.getX() - 1, e.getY()-1);
	}
}
