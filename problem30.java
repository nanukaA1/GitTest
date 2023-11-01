import acm.program.ConsoleProgram;

public class problem30 extends ConsoleProgram{ 
	public void run() {
		int n = readInt("enter Number: ");
		println(invertedNum(n));
	}

	private String invertedNum(int n) {
		String a = "";
		int x = 0;
		int d = 10;
		for(int i = n; i >0 ; i-=x) {
			x += i % d;
			d *= 10;
			a += x;
		}
		return a;
	}
}
