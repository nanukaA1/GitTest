import java.util.Arrays;

import acm.program.ConsoleProgram;

public class badSort2021 extends ConsoleProgram{
	private int[] arr = new int[5];
	public void run() {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = readInt();
		}
		sort();
		println(Arrays.toString(arr));
	}
	private void sort() {
		int curr = arr[0];
		while(sorted() != true) {
			for(int i = 0; i < arr.length - 1; i++) {
				if(curr > arr[i + 1]) {
					arr[i] = arr[i + 1];
					curr = arr[i + 1];
					arr[i + 1] = arr[i];
				}
			}
		}
	}
	private boolean sorted() {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}	
		}
		return true;
	}
}
