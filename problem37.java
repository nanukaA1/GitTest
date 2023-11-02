import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class problem37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int userNum = readInt("enter your number here: ");
		int rouletteNum = randomGeneratedNumFrom0To36();
		
		println(rouletteNum);
		while(userNum != rouletteNum){
		if(userNum == rouletteNum) {
			println("you win"); 
			break;
		} else {
			println("you lose");
		}}
	}
	
	private int randomGeneratedNumFrom0To36() {
		return rgen.nextInt(36);
	}
}
