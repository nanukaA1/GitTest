import acm.program.ConsoleProgram;

public class joker2014 extends ConsoleProgram {
	public void run() {
		println(simulateJoker(5));
	}

	private double simulateJoker(int n) {
		
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
            boolean[] player2 = new boolean[9]; 
            boolean[] player3 = new boolean[9]; 
            boolean[] player4 = new boolean[9]; 
            for (int j = 0; j < 9; j++) {
                player1[j] = deck[j];
                player2[j] = deck[j + 9];
                player3[j] = deck[j + 18];
                player4[j] = deck[j + 27];
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