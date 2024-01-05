import acm.graphics.GLine;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class fghvm extends GraphicsProgram {
	public void run() {
		int a = readInt();
		int b = readInt();
		usj(a, b);
	}

	private void usj(int a, int b ) {
		int usj = 0;
		for(int i = Math.min(a, b); i>=1; i--) {
			if(a % i == 0 && b % i == 0) {
				usj = i;
			}
		}
		println(usj);
	}

}
