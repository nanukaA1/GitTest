import acm.program.ConsoleProgram;

public class problem46 extends ConsoleProgram {
	public void run() {
		String str = readLine();
		println(mostFrequentChar(str));
	}

	private char mostFrequentChar(String string) {
		int currCount = 0;
		int maxCount = 0;
		char ch;
		char freqChar = 0;

		for (int i = 0; i < string.length(); i++) {
			ch = string.charAt(i);
			for (int j = 0; j < string.length(); j++) {
				if (ch == string.charAt(j)) {
					currCount++;
				}
				if(currCount > maxCount) {
					freqChar = string.charAt(j);
				}
			}
			maxCount = currCount;
			currCount = 0;
		}
		return freqChar;

	}
}
