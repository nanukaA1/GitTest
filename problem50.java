import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class problem50 extends ConsoleProgram {
	public void run() {
		String text = readLine();
		StringTokenizer tokenizer = new StringTokenizer(text, "l");

		int count = 0;
		while (tokenizer.hasMoreTokens()) {
			count++;
			tokenizer.nextToken();
		}
		println(count);
	}

}
