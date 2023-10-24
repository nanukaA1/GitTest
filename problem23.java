import acm.program.ConsoleProgram;

public class problem23 extends ConsoleProgram{
	public void run() {
		int n = readInt();
		
		int sum = calculateSum(n);
		println("sum is " + sum);
	}

	private int calculateSum(int num) {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += num;
		}
		return 0;
	}
	
	

}
