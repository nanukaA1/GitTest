
import java.awt.event.MouseEvent;
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class problem43 extends GraphicsProgram {
	private static final int RADIUS = 50;
	private GObject lastPressedObj;
	private int prevX;
	private int prevY;
	
	public void run() {
		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		add(circle, getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS);
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		lastPressedObj = obj;
		if(obj != null) {
			// update values
			prevX = e.getX();
			prevY = e.getY();
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		if(lastPressedObj != null) {
			// move object
			lastPressedObj.move(e.getX() - prevX, e.getY() - prevY);
			// update values
			prevX = e.getX();
			prevY = e.getY();
		}
	}

}