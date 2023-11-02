import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
//თქვენი ამოცანაა გააკეთოთ მონეტის აგდების სიმულაციები და დათვალოთ საშუალოდ
//რამდენჯერ უნდა ავაგდოთ მონეტა რათა 3-ჯერ ზედიზედ ამოვიდეს ბორჯღალო.
public class problem36 extends ConsoleProgram {
	private static final int NUM_EXPERIMENTS = 10000;
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
			boolean isHeads = rgen.nextBoolean(0.125); 
			if(isHeads) {
				break;
			}
		}
		return numFlips;
	}
}
