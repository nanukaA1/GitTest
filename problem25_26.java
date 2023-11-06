
import acm.program.ConsoleProgram;

public class problem25_26 extends ConsoleProgram {
	public void run() {
		int a = readInt();
		int b = readInt();
		
		int gcd = calculateGcd(a, b);
		println("gcd is " + gcd);
		
		int lcm = calculateLcm(a, b);
		println("lcm i " + lcm);
	}

	private int calculateGcd(int a, int b) {
		int minNum = Math.min(a, b);
		for(int i = minNum; i >= 1; i-- ) {
			if(a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return -1;
	}
	
	private int calculateLcm(int a, int b) {
		return a * b / calculateGcd(a, b);
	}

}

