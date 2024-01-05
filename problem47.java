import acm.program.ConsoleProgram;

public class problem47 extends ConsoleProgram {
	public void run() {
		String text = readLine();
		println(isPalindrom(text));
	}

	private boolean isPalindrom(String text) {
		for(int i = 0; i < text.length() / 2; i++) {
			if(text.charAt(i) != text.charAt(text.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
