import acm.graphics.GLine;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class fghvm extends ConsoleProgram {
	public void run() {
		int x = readInt();
		int y = 0;
		while(x > 0) {
			y = y * 10 + x % 10;
			x/=10;
		}
		println(y);
	}
	
}
