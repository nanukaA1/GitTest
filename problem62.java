import java.util.HashMap;

import acm.program.ConsoleProgram;

public class problem62 extends ConsoleProgram{
	public void run() {
		String s;
		HashMap<String, Integer> map = new HashMap<>();
		while (!(s = readLine()).isEmpty()) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		
		for (String name : map.keySet()) {
			println(name + " : " + map.get(name));
		}
	}
}
