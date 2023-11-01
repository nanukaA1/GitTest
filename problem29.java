import acm.program.ConsoleProgram;

public class problem29 extends ConsoleProgram {

	public void run() {
	
			int n = readInt("enter n: ");
			
			println(fib(n));
		
	}

	private int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		
		int a = 0;
		int b = 1;
		
		int curr = 0;
		for (int i = 2; i <= n; i++) {
			curr = b + a;
			a = b;
			b = curr;
		}
		
		return curr;
	}
}