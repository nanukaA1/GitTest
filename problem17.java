import acm.program.ConsoleProgram;

public class problem17 extends ConsoleProgram{
	public void run() {
		double a = readDouble("enter number: ");
		
		int b = (int) a;
		println(b);
		
		double c = a - b;
		println(c);
	}
}
