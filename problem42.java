
import java.awt.event.MouseEvent;

import acm.graphics.*;
import acm.program.*;

public class problem42 extends GraphicsProgram {

    private GLine activeLine;

    public void init() {
        addMouseListeners();
    }

    public void run() {
    	
    }

    @Override
    public void mousePressed(MouseEvent e) {
        activeLine = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
        add(activeLine);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        activeLine.setEndPoint(e.getX(), e.getY());
    }
}