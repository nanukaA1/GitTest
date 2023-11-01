import acm.program.GraphicsProgram;

public class problem29 extends GraphicsProgram{
	public void run() {
		int n = readInt("enter n: ");
		int fib = nthFibonacciNum(n)
		println(fib);
	}
	
	private int nthFibonacciNum(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		
		int a = 0;
		int b = 1;
		
		int x = 0;
		for(int i = 2; i <= n; i++) {
			x = a + b;
			a = b;
			b = x;
		}
		return x;
	}

}
