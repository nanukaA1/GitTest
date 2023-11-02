import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem35 extends ConsoleProgram {
	private static final int NUM_EXPERIMENTS = 10;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		double sumOfFlips = 0;
		for(int i = 0; i < NUM_EXPERIMENTS; i++) {
			int currNumFlips = holdExperiment();
			sumOfFlips += currNumFlips;
		}
		double avgFlips = sumOfFlips / NUM_EXPERIMENTS;
		println("avg number of flips: " + avgFlips);
	}
	
	private int holdExperiment() {
		int numFlips = 0;
		while(true) {
			numFlips += 1;
			boolean isHeads = rgen.nextBoolean();
			if(isHeads) {
				break;
			}
		}
		return numFlips;
	}
}
