import acm.program.ConsoleProgram;

public class problem27 extends ConsoleProgram{
	public void run() {
		int n = readInt("Enter n: ");
		int m = readPositiveInt("Enter m: "); 
		
		int x = pow(n, m);
		println(n + "^" + m + " = " + x);
	}

	private int readPositiveInt(String text) {
		int z = readInt(text);
		while( z < 0) {
			println("Number should be non negative");
			z = readInt(text);
		}
		return z;
	}
	private int pow(int n, int m) {
		int x = n; 
		for (int i = 0; i < m-1; i++) {
			x *= n; 
			
		}
		return x;
	}
}