import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem44 extends GraphicsProgram{
	private GOval ball;
	public void run() {
		ball = new GOval(50, 50);
		ball.setFilled(true);
		addMouseListeners();
		while(true) {
			ball.move(0, 5);
			pause(20);
		}
	}
	public void mouseClicked(MouseEvent e) {
		add(ball, e.getX() - 25, e.getY() - 25);
		
	}
}
