

import java.awt.Color;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//წინა ამოცანის გაგრძელება, დაამატეთ ვერტიკალური კედლებიდან ასხლეტვა. ანუ ბურთი
//მოძრაობს მარცხენა კედლიდან მარჯვნივ. როგორც კი მარჯვენა კედელს დაეტაკება იმავე
//სიჩქარით უნდა გააგრძელოს მოძრაობა მაჯვენა კედლიდან მარცხნივ. როგორც კი მარცხენა
//კედელს დაეტაკება უნდა გააგრძელოს მარჯვნივ და ა.შ. უსასრულოდ.

public class problem40 extends GraphicsProgram {
	private static final int PAUSE = 5;
	private static final int VEL_X = 3;
	private static final int RADIUS = 20;

	public void run() {
		GOval circle = addCircle();
		int vx = VEL_X;
		int vy = 0;

		while (true) {
			if ((circle.getX() + 2 * RADIUS >= getWidth()) || (circle.getX() < 0)) {
				vx = -vx;
			}
			circle.move(vx, vy);
			pause(PAUSE);
		}

	}

	private GOval addCircle() {
		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		circle.setColor(Color.GREEN);
		double x = 0;
		double y = getHeight() / 2 - RADIUS;
		add(circle, x, y);
		return circle;
	}
}
