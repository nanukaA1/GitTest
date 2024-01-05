import acm.graphics.GLine;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class fghvm extends ConsoleProgram {
	private static final int SENTINEL = -1;

	public void run() {
		int x = 0;
		while (true) {
			int a = readInt();
			if (a == -1) {
				break;
			}
			if (a % 2 == 0) {
				x++;
			}
		}
		println(x);
	}

}
