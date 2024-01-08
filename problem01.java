import java.util.StringTokenizer;

import acm.program.ConsoleProgram;
import stanford.karel.Karel;

public class problem01 extends ConsoleProgram{

	public void run(){
		String line = "Abigayle 7 0 0 0 0 0 0 0 0 0 720";
		String name = line.substring(0, line.indexOf(" "));
		StringTokenizer tokenizer = new StringTokenizer(line.substring(line.indexOf(" ")+1), " ");
		int i = 0;
		String[] ranking = new String[900];
		while (tokenizer.hasMoreTokens()) {
			ranking[i] = tokenizer.nextToken();
			i++;
	}
		println(name);
		println(ranking[0]);
		String text = name + " [";
		for(int i1 = 0; i1 < 11; i1++) {
			text += ranking[i1] + " ";
		}
		println(text);

}}