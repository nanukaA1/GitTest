import acm.program.ConsoleProgram;

public class problem51 extends ConsoleProgram{
	public void run() {
		while(true) {
			String text = readLine("Enter text: ");
			String editedText = removeNplet(text);
			println(editedText);
		}
	}
	
	private String removeNplet(String text) {
		String result = "";
		for(int i = 0; i < text.length(); i++) {
			char ch  = text.charAt(i);

			if(result.indexOf(ch) == -1) {
				result += ch;
			}
		}
		return result;
	}
}