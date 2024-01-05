import acm.program.ConsoleProgram;

public class problem56 extends ConsoleProgram {
	private int[] arr;
	// private int[] newArr;

	public void run() {
		int n = readInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = readInt();
		}
		sortedArray();
	}

	private void sortedArray() {
		while (!isSorted()) {
			//int i = 1;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[i - 1]) {
					int x = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = x;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			println(arr[i]);
		}
	}

	private boolean isSorted() {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
