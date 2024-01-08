import java.util.StringTokenizer;

import acm.program.ConsoleProgram;
import stanford.karel.Karel;

public class problem01 extends ConsoleProgram{

	public void run(){
		String line = "Abigayle 0 0 0 0 0 0 0 0 0 0 720";
		String name = line.substring(0, line.indexOf(" "));
		StringTokenizer tokenizer = new StringTokenizer(line, " ");
		int i = 0;
		int[] ranking = new int[12];
		while (tokenizer.hasMoreTokens()) {
			ranking[i] = Integer.parseInt(tokenizer.nextToken());
			i++;
	}
		println(name);

}}