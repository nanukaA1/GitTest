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
		update();
	}

	public void mouseClicked(MouseEvent e) {
		if (allPics) {
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
		// TODO Auto-generated method stub

	}

	private void drawImages() {
		int x = IMG_DST;
		int y = IMG_DST;
		for (int i = 0; i < images.size(); i++) {
			GImage myImage = new GImage(images.get(i));
			myImage.setSize(IMG_H, IMG_H);
			if (x + IMG_H > getWidth()) {
				y += IMG_DST + IMG_H;
				x = IMG_DST;
			}
			myImage.setLocation(x, y);
			add(myImage);
			x += IMG_DST + IMG_H;
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
		GImage image = new GImage("images/" + images.get(4));
		image.setSize(200, 200);
		image.setLocation(getWidth() / 2, getHeight() / 2);
		add(image);
	}
}
