import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class spaceRocks extends GraphicsProgram {
	private static final int NUM_ROCKS = 8;
	private static final int ROCK_DIAMETER = 80;
	private static final int ROCK_SPACING = 20;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private GObject last;
	private ArrayList<GOval> rocks = new ArrayList<>();

	public void run() {
		setSize(ROCK_DIAMETER * 7 + ROCK_SPACING * 7, ROCK_DIAMETER * 2);
		addRocks();
		addMouseListeners();
	}

	private void addRocks() {
		double x = 0;
		double y = 0;
		for (int i = 0; i < 7; i++) {
			GOval rock = new GOval(ROCK_DIAMETER, ROCK_DIAMETER);
			x = ROCK_DIAMETER * i + ROCK_SPACING * i;
			rock.setFilled(true);
			Color color = rgen.nextColor();
			rock.setFillColor(color);
			add(rock, x, y);
			rocks.add(rock);
		}
	}

	private void reposition() {
		double x = 0;
		for (GOval rock : rocks) {
			rock.setLocation(x, 0);
			x += ROCK_DIAMETER + ROCK_SPACING;
		}
	}

	public void mouseClicked(MouseEvent e) {
		GObject current = getElementAt(e.getX(), e.getY());
		if (last == null) {
			last = current;
		} else {
			if (last == current) {
				rocks.remove(current);
				remove(current);
				last = null;
				reposition();
			} else {
				int lastSelectionIndex = rocks.indexOf(last);     
				int currentSelectionIndex = rocks.indexOf(current);    
				rocks.set(lastSelectionIndex, (GOval) current);     
				rocks.set(currentSelectionIndex, (GOval) last);     
				last= null; 
				reposition();
			}
		}
	}
}
