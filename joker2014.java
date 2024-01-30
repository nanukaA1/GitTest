import acm.program.ConsoleProgram;

public class joker2014 extends ConsoleProgram {
	public void run() {
		println(simulateJoker());
	}

	private double simulateJoker() {
	  
		
}

	private boolean hasTwoJokers(boolean[] player1) {
		int jokerCount = 0;
        for (boolean card : player1) {
            if (card) {
                jokerCount++;
            }
        }
        return jokerCount == 2;
	}
}