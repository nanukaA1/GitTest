import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;

import acm.graphics.GCanvas;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem18 extends GraphicsProgram 
	implements ComponentListener{

	public void init() {
		addComponentListener(this);
		add(new JButton("     RECOLOR     "), SOUTH);
		addActionListeners();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < rectColors.length; i++) {
			for (int j = 0; j < rectColors[i].length; j++) {
				rectColors[i][j] = null;
			}
		}
		draw();
	}
	
	public void run() {
		rectColors = new Color[GRID_NUM][GRID_NUM];
		draw();
	}
	
	private static final int GRID_NUM = 8;
	private RandomGenerator generator = RandomGenerator.getInstance();
	private Color[][] rectColors;
	
	private void draw() {
		removeAll();
		double width = (double)getWidth() / GRID_NUM;
		double height = (double)getHeight() / GRID_NUM;
		for (int i = 0; i < GRID_NUM; i++) {
			for (int j = 0; j < GRID_NUM; j++) {
				GRect rect = new GRect(i * width, j * height, 
						width, height);
				rect.setFilled(true);
				if (rectColors[i][j] == null) {
					rectColors[i][j] = generator.nextColor();
				}
				rect.setColor(rectColors[i][j]);
				add(rect);
			}
		}
		
	}

	public void componentResized(ComponentEvent arg0) {
		draw();
	}


	
}