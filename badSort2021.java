import java.util.Arrays;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

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
		RandomGenerator rgen = RandomGenerator.getInstance();
		int curr;
		
		while(sorted() != true) {
			for(int i = 0; i < arr.length - 1; i++) {
				int a = rgen.nextInt(0,arr.length - 1);
				int b = rgen.nextInt(0,arr.length -1);
				int min = Math.min(a,b);
				int max = Math.max(a,b);
				if(arr[min] > arr[max]) {
					curr = arr[min];
					arr[min] = arr[max];
					arr[max] = curr;
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
