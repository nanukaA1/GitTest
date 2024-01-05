import acm.program.ConsoleProgram;

public class problem51 extends ConsoleProgram{
	public void run() {
		String text = readLine();
		println(removeDuplicates(text));
	}

	private String removeDuplicates(String text) {
		String newText = "";
		for(int i = 0; i < text.length(); i++) {
			if(newText.indexOf(text.charAt(i)) == -1) {
				newText += text.charAt(i);
			}
		}
		return newText;
	}
}
