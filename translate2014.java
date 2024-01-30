import acm.program.ConsoleProgram;

public class translate2014 extends ConsoleProgram {
	public void run() {
		translateToTitle("etErNAl sUNShiNe OF tHe Spotless mIND");
	}

	private String translateToTitle(String text) {
		String translated = "";
		String[] words = text.split(" ");
		String[] words1 = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			words1[i] =Character.toUpperCase(words[i].charAt(0))+ words[i].substring(1).toLowerCase();
			println(words1[i]);
		}
		return translated;
	}

}
