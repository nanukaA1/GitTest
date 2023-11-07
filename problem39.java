import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class problem39 extends GraphicsProgram {
	private static final int PAUSETIME = 10;
	public void run() {
		GOval ball = new GOval(20, 20);
		add(ball, 0, getHeight()/ 2);
		
		while(ball.getX() < getWidth() - 20);
		ball.move(5, 7);
		pause(PAUSETIME);
	}
}
