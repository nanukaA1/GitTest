import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

//რულეტკა, მომხმარებელს შეყავს 0 დან 36 მდე რიცხვი, შემდეგ ხდება რულეტკის
//დატრიალების სიმულაცია, კონსოლში უნდა დაიბეჭდოს ამოსული რიცხვი და მოიგო თუ არა
//დადებულმა რიცხვმა

public class problem37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int n = readInt("enter a number from 0 to 36: ");
		if(legal(n)){
			int number = ruletka();
		
		if(number == n){
			println("you won");
			
		}else{
			println("you lost");
		}
		}
	}

	private int ruletka() {
		int result = rgen.nextInt(0, 36);

		return result;
	}

	private boolean legal(int n) {
		if (n > 36 || n < 0) {
			return false;
		}
		return true;
	}

}
