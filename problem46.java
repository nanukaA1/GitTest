import acm.program.ConsoleProgram;

public class problem46 extends ConsoleProgram {
	public void run() {
		String str = readLine();
		println(mostFrequentChar(str));
	}

	private char mostFrequentChar(String string) {
		int count1 = 0;
		int count2 = 0;
		char ch;
		char freqChar = 0;

		for (int i = 0; i < string.length(); i++) {
			ch = string.charAt(i);
			for (int j = 0; j < string.length(); j++) {
				if (ch == string.charAt(j)) {
					count1++;
				}
				if(count1 > count2) {
					freqChar = string.charAt(j);
				}
			}
			
			count1 = 0;
		}
		return freqChar;

	}
}
