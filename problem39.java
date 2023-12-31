
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem39 extends GraphicsProgram {
	private static final int RADIUS = 20;
	private static final int PAUSETIME = 10;

	public void run() {
		GOval ball = new GOval(RADIUS, RADIUS);
		add(ball, 0, getHeight() / 2);

		while (ball.getX() <= getWidth() - 20) {
			ball.move(5, 0);
			pause(PAUSETIME);
		}
	}
}
