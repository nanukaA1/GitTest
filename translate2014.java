import acm.program.ConsoleProgram;

public class translate2014 extends ConsoleProgram{
	public void run() {
		translateToTitle("etErNAl sUNShiNe OF tHe Spotless mIND");
	}
	private String translateToTitle(String text){
		String translated = "";
		String[] words = text.split(" ");
		println(words[0]);
		return translated;
	}

}
