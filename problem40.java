import acm.graphics.GOval;
import acm.program.GraphicsProgram;
//წინა ამოცანის გაგრძელება, დაამატეთ ვერტიკალური კედლებიდან ასხლეტვა. ანუ ბურთი
//მოძრაობს მარცხენა კედლიდან მარჯვნივ. როგორც კი მარჯვენა კედელს დაეტაკება იმავე
//სიჩქარით უნდა გააგრძელოს მოძრაობა მაჯვენა კედლიდან მარცხნივ. როგორც კი მარცხენა
//კედელს დაეტაკება უნდა გააგრძელოს მარჯვნივ და ა.შ. უსასრულოდ.
public class problem40 extends GraphicsProgram {
	private static final int RADIUS = 20;
	private static final int PAUSETIME = 10;

	public void run() {
		GOval ball = new GOval(RADIUS, RADIUS);
		add(ball, 0, getHeight() / 2);
		int vx = 5;
		int vy = 0;
		while (true) {
			
			if(ball.getX() <= getWidth() - RADIUS){
				ball.move(vx, vy);
				pause(PAUSETIME);
				vx*=-1;
			} if(vx< 0){
				ball.move(vx, vy);
				pause(PAUSETIME);
			}
			
		}
	}
}
