import acm.graphics.GLine;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class fghvm extends ConsoleProgram {
	public void run() {
		int a = readInt();
		int b = readInt();
		double x = (double)(a+b)/2;
		println(x);
	}

}
