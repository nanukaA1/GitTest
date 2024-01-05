import acm.program.ConsoleProgram;

public class problem45 extends ConsoleProgram{
	public void run() {
		String text = readLine();
		char ch = readLine().charAt(0);
		println(countSymbol(text,ch));
	}

	private int countSymbol(String text, char ch) {
		int count = 0;
		for(int i = 0; i < text.length(); i++) {
			if(ch == text.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
