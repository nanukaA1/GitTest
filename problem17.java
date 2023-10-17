import acm.program.ConsoleProgram;

public class problem17 extends ConsoleProgram{
	public void run() {
		double a = readInt("enter number: ");
		
		int b = (int) a;
		println(b);
		
		double c = a - b;
		println(c);
	}
}
