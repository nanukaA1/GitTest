import acm.program.ConsoleProgram;

public class problem46 extends ConsoleProgram {
	public void run() {
		String text = readLine();
		println(mostFrequentSymbol(text));
	}

	private char mostFrequentSymbol(String text) {
		int max = 0;
		char frequentSymbol = 0;
		for(int i = 0; i < text.length(); i++) {
			if(countSymbols(text, text.charAt(i)) > max) {
				max = countSymbols(text, text.charAt(i));
				frequentSymbol = text.charAt(i); 
			}
		}
		return frequentSymbol;
	}

	private int countSymbols(String text, char ch) {
		int count = 0;
		for(int i = 0; i < text.length(); i++) {
			if(ch == text.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
