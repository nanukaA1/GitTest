import acm.program.ConsoleProgram;

public class problem17 extends ConsoleProgram{
	public void run() {
		//კონსოლიდან წაიკითხეთ ორი მთელი რიცხვი და დაბეჭდეთ მათ შორის მაქსიმალური.
		int a = readInt("enter first number: ");
		int b = readInt("enter second number: ");
		
		if(a>b) {
			println(a);
		} else {
			println(b);
		}
	}
}
