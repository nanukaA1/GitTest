import java.util.ArrayList;
import java.util.Map;

import acm.program.ConsoleProgram;

public class kitchen2021 extends ConsoleProgram {
	public void run() {

	}

	private ArrayList<String> kitchen(Map<String, ArrayList<String>> receipts, ArrayList<String> ingredients) {
		ArrayList<String> result = new ArrayList<>();
		for (String key : receipts.keySet()) {
			if (canBeCooked(receipts.get(key), ingredients)) {
				result.add(key);
			}
		}
		return result;
	}

	private boolean canBeCooked(ArrayList<String> neededIngredients, ArrayList<String> ourIngredients) {
		for(String ing: neededIngredients) {
			if(!ourIngredients.contains(ing)) {
				return false;
			}
		}
		return true;
	}
}
