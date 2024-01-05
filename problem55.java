import acm.program.ConsoleProgram;

public class problem55 extends ConsoleProgram {
	private int[] arr;
	public void run() {
		int n = readInt();
		arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = readInt();
		}
		
		println(isSorted());
	}
	private boolean isSorted() {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				return false;
			}
		}
		return true;
	}
}
