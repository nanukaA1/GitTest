import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class problem39 extends GraphicsProgram {
	private static final int PAUSETIME = 1000;
	public void run() {
		GRect myRect = new GRect(100, 200);
		myRect.setFilled(true);
		add(myRect, 100, 150);
		
		myRect.setColor(Color.RED);
		//pause(PAUSETIME);
		myRect.setColor(Color.GREEN);
		myRect.setLocation(200, 250);
		
	}
}
