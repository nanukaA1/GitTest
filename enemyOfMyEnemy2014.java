import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;

import acm.program.ConsoleProgram;

public class enemyOfMyEnemy2014 extends ConsoleProgram{
	private HashMap<String, HashSet<String>> friendships;
	public void run() {
	try {
		String newLine = "";
		BufferedReader reader = new BufferedReader(new FileReader("raghac"));
		while (true) {
			newLine = reader.readLine();
			if (newLine == null) {
				break;
			}
			String[] names = newLine.split(" ");

			String fr = names[0];
			String fri = names[1];
			 if (!friendships.containsKey(fr)) {
                 friendships.put(fr, new HashSet<>());
             }
             if (!friendships.containsKey(fri)) {
                 friendships.put(fri, new HashSet<>());
             }

             friendships.get(fr).add(fri);
             friendships.get(fri).add(fr); 

		}

	} catch (Exception e) {

	}
}
     private boolean enemyOfMyEnemy(String name) {
		
	}

}
