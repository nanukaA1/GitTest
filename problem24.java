
import acm.program.ConsoleProgram;

public class problem24 extends ConsoleProgram {
	public void run() {
		int a = readInt();
		
		int x = calculateDivCount(a);
		println("count is " + x );
	}

	private int calculateDivCount(int num) {
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i ==0 ) {
				count += 1;
			}
		}
		return count;
	}

}

