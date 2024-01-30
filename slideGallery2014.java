import java.util.ArrayList;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;
import acm.util.ErrorException;

public class slideGallery2014 extends GraphicsProgram {
	public static final int MIN_DRAG = 50;
	public static final int SMALL_IMG_H = 200;
	public static final int BIG_IMG_H = 500;
	public static final int IMG_DST = 20;

	private ArrayList<String> images = new ArrayList<>();

	public void run() {
		addImages();
	}

	private void addImages() {
		images.add("MehranS.jpg");
		images.add("MattJ.jpg");
		images.add("KimberL.jpg");
		images.add("BenN.jpg");
		images.add("LekanW.jpg");
		GImage image = new GImage(images.get(0));
		image.setLocation(getWidth() / 2, getHeight() / 2);
		add(image);
	}
}
