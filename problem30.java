<<<<<<< HEAD
import acm.program.ConsoleProgram;

public class problem30 extends ConsoleProgram{ 
	public void run() {
		int n = readInt("enter Number: ");
		println(reverse(n));
	}

	private String reverse(int n) {
		String reversedNum = "";
		while(n != 0) {
			reversedNum += n % 10;
			n /= 10; 
		}
		return reversedNum;
		
	}
}
=======
import acm.program.ConsoleProgram;

public class problem30 extends ConsoleProgram{ 
	public void run() {
		int n = readInt("enter Number: ");
		println(reverse(n));
	}

	private String reverse(int n) {
		String reversedNum = "";
		while(n != 0) {
			reversedNum += n % 10;
			n /= 10; 
		}
		return reversedNum;
		
	}
}
>>>>>>> 550ae8305d99d169daea069a75673d4f57327e24
