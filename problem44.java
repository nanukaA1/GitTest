import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem44 extends GraphicsProgram{
	private GOval ball;
	public void run() {
		addMouseListeners();
		while(true) {
			ball.move(0, 5);
			pause(20);
		}
	}
	public void mouseClicked(MouseEvent e) {
		//remove(ball);
		ball = new GOval(e.getX() - 25, e.getY() - 25, 50, 50);
		ball.setFilled(true);
		add(ball);
		
		
	}
}
