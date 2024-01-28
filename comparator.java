import java.util.ArrayList;
import java.util.Comparator;

import acm.program.ConsoleProgram;

public class comparator extends ConsoleProgram {
	public void run() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(readLine());
		list.add(readLine());
		list.add(readLine());
		Comparator<String> c = Comparator.comparing(String::length);
		list.sort(c);
		println(list);
	}
}
