import acm.program.ConsoleProgram;

public class problem32 extends ConsoleProgram {
	public void run() {
		for (int i = 2; i <= 1000; i++) {
			if (isPrime(i)) {
				println(i);
			}
		}
	}

	private boolean isPrime(int n) {
		int countDivisors = countDivs(n);
		return countDivisors == 2;
	}

	private int countDivs(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}
}
