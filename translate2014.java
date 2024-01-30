import acm.program.ConsoleProgram;

public class translate2014 extends ConsoleProgram{
	public void run() {
		translateToTitle("etErNAl sUNShiNe OF tHe Spotless mIND");
	}
	private String translateToTitle(String text){
		String translated = "";
		String[] words = text.split(" ");
		for(int i = 0; i < words.length; i++) {
			 words[i].toLowerCase();
			// words[i].substring(0,1).toUpperCase();
			 println(words[i]);
		}
		return translated;
	}

}
