import acm.program.ConsoleProgram;

public class jbj extends ConsoleProgram {
	public void run() {
		String text = readLine();
		String str = readLine();
		char ch = str.charAt(0);
		int count = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ch) {
				count += 1;
			}
		}
		println(count);
	}
}
