import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class problem34 extends GraphicsProgram {
	public void run() {
		RandomGenerator rgen = new RandomGenerator();
		int a = rgen.nextInt(6);
		println(a);
	}
}
