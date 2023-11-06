
import acm.program.ConsoleProgram;

public class problem20 extends ConsoleProgram{
	public void run() {
		int n = readInt("enter n: ");
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			int x = readInt("enter number #" + (i+1) + " ");
			sum += x;
		}
		
		println(sum);
	}
}
