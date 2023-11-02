import acm.program.ConsoleProgram;
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
public class problem38 extends ConsoleProgram{ 
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int money = 1000;
		
		while(money > 0) {
			int userBet = readInt("enter your bet here: ");
			int userNum = readInt("enter the number you want to bet on: ");
			if(userBet > money) {
				println("you exceed the money on your balance: ");
			}
			else {
				println(rgen.nextInt(0,36));
				if(userNum == rgen.nextInt(0,36)) {
					println("you win");
					money += userBet;
					println("amount of money won: " + userBet);
					println("your balance: " + money);
				}
				else {
					println("you lose");
					money -= userBet;
					println("amount of money lost:" + userBet);
					println("your balance: " + money);
				}
			}
			
		}
		
	}
	

}
