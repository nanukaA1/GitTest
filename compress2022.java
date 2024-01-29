import acm.program.ConsoleProgram;

public class compress2022 extends ConsoleProgram {
	public void run() {
		String text = readLine();
		println(compressed(text));
	}

	private String compressed(String text) {
		if (text.length() == 0) {
			return "text size is equal to 0";
		}
		String compressedText = "" + text.charAt(0);
		int x = 1;
		for (int i = 1; i < text.length(); i++) {
			if (text.charAt(i) == text.charAt(i - 1)) {
				x++;
			} else {
				compressedText += x;
				x = 1;
				compressedText += text.charAt(i);
			}
		}
		compressedText+=x;
		if(compressedText.length() > text.length()) {
			return text;
		}
		return compressedText;
	}
}
