import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem38 extends ConsoleProgram {
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 36;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int remAmount = 1000;
		
		while(remAmount > 0) {
			int betNumber = readBetNumber();
			int betAmount = readBetAmount(remAmount);
			int rouletteResult = spinRoulette();
			if(betNumber == rouletteResult) {
				remAmount += betAmount;
				println("You won this turn!");
			}else {
				remAmount -= betAmount;
				println("You lost this turn!");
			}
			println("Remaining amount: " + remAmount);
		}
		println("GAME OVER, you lost.");
		
	}

	private int readBetAmount(int remAmount) {
		while(true) {
			int betAmount = readInt("Enter bet Amount(should be <= " + remAmount + "): ");
			if(betAmount <= remAmount) {
				return betAmount;
			}
		}
	}

	private int readBetNumber() {
		while(true) {
			int betNum = readInt("Enter bet number from " + MIN_VALUE + " to " + MAX_VALUE + ": ");
			if(betNum >= MIN_VALUE && betNum <= MAX_VALUE) {
				return betNum;
			}
		}
	}
	
	private int spinRoulette() {
		int rouletteResult = rgen.nextInt(MIN_VALUE, MAX_VALUE);
		println("Roulette result is: " + rouletteResult);
		return rouletteResult;
	}
}
