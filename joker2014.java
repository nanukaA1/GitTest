import java.util.ArrayList;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class joker2014 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		println(simulateJoker(1000));
	}

	private double simulateJoker(int n) {
		double count = 0;
		for (int i = 0; i < n; i++) {
			ArrayList<Boolean> cards = new ArrayList<>();
			for (int j = 0; j < 2; j++) {
				cards.add(true);
			}
			for (int j = 0; j < 2; j++) {
				cards.add(false);
			}
			int jokersCount = 0;
			for (int j = 0; j < 9; j++) {
				int index = rgen.nextInt(0, cards.size() - 1);
				if (cards.get(index)) {
					jokersCount++;
				}
				cards.remove(index);
				int index2 = rgen.nextInt(0, cards.size() - 1);
				cards.remove(index2);
				int index3 = rgen.nextInt(0, cards.size() - 1);
				cards.remove(index3);
				int index4 = rgen.nextInt(0, cards.size() - 1);
				cards.remove(index4);
			}
			if (jokersCount == 2) {
				count++;
			}
		}
		return count / n;
	}

}