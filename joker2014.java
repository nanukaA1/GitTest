import acm.program.ConsoleProgram;

public class joker2014 extends ConsoleProgram {
	public void run() {
		println(simulateJoker());
	}

	private double simulateJoker() {
		
	  double  occ = 0;
		for (int i = 0; i < 10000; i++) {
			 boolean[] deck = new boolean[36];
		        deck[34] = true;
		        deck[35] = true;
		        
		        for (int j = deck.length - 1; j > 0; j--) {
		            int index = (int) (Math.random() * (i + 1));
		            boolean temp = deck[index];
		            deck[index] = deck[i];
		            deck[i] = temp;
		        }

            boolean[] player1 = new boolean[9]; 
            
            for (int j = 0; j < 9; j++) {
                player1[j] = deck[j];
            }
            if (hasTwoJokers(player1)) {
                occ++;
            }
		
	}
		return occ;
		
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