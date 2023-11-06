
import acm.program.ConsoleProgram;

public class problem28 extends ConsoleProgram {
	private static final int SENTINEL = -1;
	public void run() {
		int countOfEven = 0;
		
		while(true) {
			int x = readInt("enter x: " );
			if(x == SENTINEL) {
				break;
			}
			if(x % 2 == 0) {
				countOfEven += 1;
			}
		}
		
		println("Count of even numbers is: " + countOfEven);
	}
}

