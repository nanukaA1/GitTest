import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem44 extends GraphicsProgram{
	private GOval ball;
	public void run() {
		addMouseListeners();
	}
	public void mouseClicked(MouseEvent e) {
		ball = new GOval(e.getX(), e.getY(), 50, 50);
		
	}
}
