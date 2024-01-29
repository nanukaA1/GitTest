import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class mamashviloba2014 extends ConsoleProgram {
	public void run() {
		getCousins("raghac.java", "glenn");
	}

	private ArrayList<String> getCousins(String fileName, String name) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			while (true) {
				String newLine = reader.readLine();
				if (newLine == null) {
					return null;
				}
			}

		} catch (FileNotFoundException e) {
			return null;

		} catch (IOException e) {
			return null;
		}
	}

}
