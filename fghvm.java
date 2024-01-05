import acm.graphics.GLine;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

//მოხმარებელს აქვს საწყისი თანხა 1000, თამაშობს მანამ სანამ არ წააგებს ყველაფერს. ყოველ
//ჯერზე შეყავს ფსონის თანხა და რიცხვი რომელზეც დებს. ხდება რულეტკის დატრიალების
//სიმულაცია(0-დან 36-მდე შემთხვევითი რიცხვი), მოგების შემთხვევაში მოთამაშეს
//უორმაგედბა დადებული თანხა წაგების შემთხვევაში კი მოთამაშე კარგავს დადებულ თანხას.
//მოთამაშე მოგებულია მაშინ თუ რულეტკაზე ამოსული რიცხვი ემთხვევა მის მიერ დადებულ
//რიცხვს. პროგრამა ყოველ მოქმედებაზე უნდა ბეჭდავდეს შესაბამის შეტყობინებას, ადვილად
//
//რომ გაერკვეს მოთამაშე, რა რიცხვი ამოვიდა, რამდენი წააგო, რამდენი მოიგო, რამდენი აქვს
//ბალანსი.
public class fghvm extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private int balance = 1000;

	public void run() {
		while (balance > 0) {
			int bet = readInt();
			int betMoney = readInt();
			spin(bet, betMoney);
		}
	}

	private void spin(int bet, int betMoney) {
		int rand = rgen.nextInt(0, 36);
		println(rand);
		if (rand == bet) {
			balance += betMoney;
			println("you win");
			println("your balance is " + balance);
		}
		if (rand == bet) {
			balance -= betMoney;
			println("you lose");
			println("your balance is " + balance);
		}
	}

}
