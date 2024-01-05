import acm.program.ConsoleProgram;

public class problem54 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter count: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = readInt("Enter number: ");
		}
		int max1 = 0;
		int maxIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max1) {
				max1 = arr[i];
				maxIndex = i;
			}
		}
		int max2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max2 && i != maxIndex) {
				max2 = arr[i];
			}
		}
		println(max1);
		println(max2);
	}

}