import java.util.StringTokenizer;

import acm.program.ConsoleProgram;
import stanford.karel.Karel;

public class problem01 extends ConsoleProgram{

	public void run(){
		String line = "Abigayle 0 0 0 0 0 0 0 0 0 0 720";
		String name = line.substring(0, line.indexOf(" "));
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		int i = 0;
		String[] ranking = new String[900];
		while (tokenizer.hasMoreTokens()) {
			ranking[i] = tokenizer.nextToken();
			i++;
	}
		println(name);
		println(ranking[i]);

}}