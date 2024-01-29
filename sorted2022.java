import java.util.ArrayList;
import java.util.Arrays;

import acm.program.ConsoleProgram;

public class sorted2022 extends ConsoleProgram {
	public void run() {
		println(almostSorted(new ArrayList<>(Arrays.asList(2, 3, 4, 5))));
	}

	private boolean almostSorted(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {
				swapElements(a,i,j);
				reverseElements(a, i, j);
				if (Sorted(a)) {
					return true;
				}
			}
		}
		return false;
	}
	private boolean Sorted(ArrayList<Integer> a) {
		for (int i = 1; i < a.size(); i++) {
			if (a.get(i) < a.get(i - 1)) {
				return false;
			}
		}
		return true;
	}

	private void swapElements(ArrayList<Integer> a, int i, int j) {
		int tmp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, tmp);
	}

	private void reverseElements(ArrayList<Integer> a, int i, int j) {
		int mid = (j - i + 1) / 2;
		for (int k = 0; k < mid; k++) {
			swapElements(a, i + k, j - k);
		}
	}
}
