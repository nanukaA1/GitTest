import acm.program.ConsoleProgram;

public class raffle extends ConsoleProgram {
	public void run() {
		checkRaffleDistance("sd5s","sd4s");
	}

	private void checkRaffleDistance(String winningVal, String yourVal) {
		int count = 0;
		for(int i = 0; i < winningVal.length(); i++) {
			if(winningVal.charAt(i) != yourVal.charAt(i)) {
				count++;
			}
		}
		
		if(count == 0) {
			println("you win");
		} else if(count == 1 || count == 2) {
			println("small prize");
		} else{
			println("nothing");
		}
	}
}
