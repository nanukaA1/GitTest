import acm.program.ConsoleProgram;

public class badSort2021 extends ConsoleProgram{
	private int[] arr = new int[5];
	public void run() {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = readInt();
		}
		sort();
		println(arr);
	}
	private void sort() {
		while(sorted() != true) {
			for(int i = 0; i < arr.length; i++) {
				
			}
		}
	}
	private boolean sorted() {
		// TODO Auto-generated method stub
		return false;
	}
}
