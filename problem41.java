import java.awt.Color;

import com.sun.glass.events.KeyEvent;
import com.sun.glass.events.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem41 extends GraphicsProgram {
	public void run() {
		addMouseListeners();
	}

	public void mouseMoved(MouseEvent e) {
		GOval dot = new GOval(1, 1);
		while(true) {
			add(dot, e.getX(), e.getY());
		}
	}
}
