<<<<<<< HEAD
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int userNum = readInt("enter your number here: ");
		int rouletteNum = rgen.nextInt(36);
		
		println(rouletteNum);
		
		if(userNum == rouletteNum) {
			println("you win"); 
		} else {
			println("you lose");
		}
	}
}
=======
import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int userNum = readInt("enter your number here: ");
		int rouletteNum = rgen.nextInt(36);
		
		println(rouletteNum);
		
		if(userNum == rouletteNum) {
			println("you win"); 
		} else {
			println("you lose");
		}
	}
}
>>>>>>> 550ae8305d99d169daea069a75673d4f57327e24
