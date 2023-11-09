import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem41 extends GraphicsProgram {
	public void run() {
		addMouseListeners();
	}

	public void mouseClicked(MouseEvent e) {
		GOval dot = new GOval(1, 1);
		while(true) {
			add(dot, e.getX(), e.getY());
		}
		
	}
}
