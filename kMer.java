import java.util.HashSet;

import acm.program.ConsoleProgram;

public class kMer extends ConsoleProgram {
	private HashSet<String> frequent = new HashSet<>();

	public void run() {
		println(mostfrequentKmer("BOBOK", 2));
	}

	private Object mostfrequentKmer(String string, int k) {
		for (int i = 0; i < string.length(); i++) {
			for (int j = i + k; j <= string.length(); j++) {
				
			}
		}
	}
}
