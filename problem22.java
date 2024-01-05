
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class problem22 extends GraphicsProgram{
	public void run() {
		int a = readInt();
		int x = 0;
		for(int i = 1; i < a; i ++) {
			if(a % i == 0) {
				x++;
			}
		}
		println(x);
	}
	
	
}