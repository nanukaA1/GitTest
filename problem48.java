import acm.program.ConsoleProgram;

public class problem48 extends ConsoleProgram {
	public void run() {
		String text = readLine();
		printStatistics(text);
	}

	private void printStatistics(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (isFirstOccurance(text, text.charAt(i), i)) {
				println(text.charAt(i) + ": " + symbolCount(text, text.charAt(i)));
			}
		}
	}

	private int symbolCount(String text, char ch) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (ch == text.charAt(i)) {
				count++;
			}
		}
		return count;
	}

	private boolean isFirstOccurance(String text, char ch, int i) {
		if (text.indexOf(ch) == i) {
			return true;
		}
		return false;
	}
}
