import java.util.ArrayList;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;
import acm.util.ErrorException;
import javafx.scene.input.MouseEvent;

public class slideGallery2014 extends GraphicsProgram {

	public static final int IMG_H = 200;
	public static final int IMG_DST = 20;
	private boolean allPics = true;
	private ArrayList<String> images = new ArrayList<>();
	private GImage currImage;
	private int currIndex;

	public void run() {
		addImages();
		addMouseListeners();
		update();
	}

	public void mouseClicked(MouseEvent e) {
		if (allPics) {
			int x = (int) e.getX();
			int y = (int) e.getY();
			currImage = (GImage) getElementAt(x, y);
			allPics = false;
		} else {
			if (e.getX() < getWidth() / 3) {

			} else if (e.getX() > getWidth() / 3 && e.getX() < getWidth() * 2 / 3) {
				allPics = true;
			} else if (e.getX() > getWidth() * 2 / 3) {

			}
		}
		update();

	}

	private void update() {
		removeAll();
		if (allPics) {
			drawImages();
		} else {
			drawOne();
		}
	}

	private void drawOne() {
		currImage.setSize(getWidth(), getHeight());
		currImage.setLocation(0, 0);
		add(currImage);
	}

	private void drawImages() {
		double x = IMG_DST;
		double y = IMG_DST;
		for (int i = 0; i < images.size(); i++) {
			GImage newImage = new GImage("images/" + images.get(i));
			newImage.setSize(IMG_H, IMG_H);
			newImage.setLocation(x, y);
			add(newImage);
			x += IMG_H + IMG_DST;
			if (x + IMG_H + IMG_DST > getWidth()) {
				y += IMG_H + IMG_DST;
				x = IMG_DST;
			}
		}
	}

	private void addImages() {
		images.add("MehranS.jpg");
		images.add("MattJ.jpg");
		images.add("KimberL.jpg");
		images.add("BenN.jpg");
		images.add("LekanW.jpg");
		images.add("JessicaL.jpg");
		images.add("JoelG.jpg");
	}
}
