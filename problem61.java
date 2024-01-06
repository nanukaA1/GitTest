

import java.util.HashSet;
import java.util.Set;

import acm.program.*;
import javafx.util.Pair;

public class problem61 extends ConsoleProgram {
		
	public void run() {
		int n = readInt();
		int m = readInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i ++) {
			arr[i] = readInt();
		}
		Pair p = getSum(arr, m);
		if (p == null) {
			println("Pair not found!");
		} else {
			println(p);
		}
	}

	private Pair getSum(int[] arr, int sum) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i ++) {
			if (2 * arr[i] == sum && set.contains(arr[i])) {
				return new Pair(arr[i], arr[i]);
			}
			set.add(arr[i]);
		}
		for (Integer key : set) {
			if (set.contains(sum - key)) {
				println(new Pair(key, sum - key));
			}
		}
		return null;
	}
}