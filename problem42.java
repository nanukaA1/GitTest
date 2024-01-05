import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class problem42 extends GraphicsProgram{
	private double x1 = 0;
	private double y1 = 0;
	private double x2 = 0;
	private double y2 = 0;
	public void run() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		x1 = getX();
		y1 = getY();
	}
	
	public void mouseDragged(MouseEvent e) {
		x2 = getX();
		y2 = getY();
		
		GLine line = new GLine(x1,y1,x2,y2);
		add(line);
	}
}
