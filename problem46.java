import acm.program.ConsoleProgram;

public class problem46 extends ConsoleProgram {
	public void run() {
		String str = readLine();
		println(mostFrequentChar(str));
	}

	private int mostFrequentChar(String string) {
		int count1 = 0;
		int count2 = 0;
		char ch;

		for (int i = 0; i < string.length(); i++) {
			ch = string.charAt(i);
			for (int j = 0; j < string.length(); j++) {
				if (ch == string.charAt(j)) {
					count1++;
				}
			}
			if(count1 > count2) {
				count2 = count1;
			}
			count1 = 0;
		}
		return count2 - 1;

	}
}
