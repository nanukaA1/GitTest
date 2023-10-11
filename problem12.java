import com.sun.prism.paint.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class problem12 extends GraphicsProgram{
	public void run() {
		GRect rect1 = new GRect(150,200,100,150);
		GRect rect2 = new GRect(140,175,20,20);
		GRect rect3 = new GRect(20,20,100,125);
		add(rect1);
		add(rect2);
		rect1.setColor(Color.BLUE);

		rect1.fillRect(100,100,120,120);
		
		
	}

}
