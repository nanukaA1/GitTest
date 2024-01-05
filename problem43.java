
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class problem43 extends GraphicsProgram{
	public void run() {
		addCircle();
		addMouseListeners();
		//drag();
	}

	private void addCircle() {
		GOval circle = new GOval(50, 50);
		add(circle, getWidth() / 2 - 25, getHeight() / 2);
	}
}
