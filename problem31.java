import acm.program.ConsoleProgram;

public class problem31 extends ConsoleProgram {
	public void run() {
		println(isPrime());
	}

	private boolean isPrime() {
		int b = readInt();
		int x = 0;
		for (int i = 1; i <= b; i++) {
			if (b % i == 0) {
				x++;
			}
		}
		return x == 2;
	}

}
