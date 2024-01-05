
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem35 extends ConsoleProgram {
	private static final int NUM_EXPERIMENTS = 10000000;
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		double sumOfFlips = 0;
		for (int i = 0; i < NUM_EXPERIMENTS; i++) {
			sumOfFlips += holdExperiment();
		}
		double avgFlips = sumOfFlips / NUM_EXPERIMENTS;
		println("avg number of flips: " + avgFlips);
	}

	private int holdExperiment() {
		int numFlips = 0;
		while (true) {
			numFlips += 1;
			boolean isHeads = rgen.nextBoolean(); // თუ ყალბი მონეტაა და ვთქვათ
													// ალბათობა 9 მაშინ 0.1-ს...
			if (isHeads) {
				break;
			}
		}
		return numFlips;
	}
}
