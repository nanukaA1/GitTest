import acm.program.ConsoleProgram;

public class addSpaces2021 extends ConsoleProgram {
	public void run() {
		String text = readLine();
		int[] spaces = { 5, 6, 7 };
		println(addSpaces(text, spaces));
	}

	private String addSpaces(String text, int[] spaces) {
		for(int i = 0; i < spaces.length; i++) {
			int index = spaces[i] + i;
			text = text.substring(0, index) + " " + text.substring(index);
		}
		return text;
	}
}
