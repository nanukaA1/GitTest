import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import acm.program.ConsoleProgram;

public class mamashviloba2014 extends ConsoleProgram {

	private HashMap<String, HashSet<String>> fatherSon;

	public void run() {
		getCousins("raghac.java", "glenn");
	}

	private ArrayList<String> getCousins(String fileName, String name) {
		ArrayList<String> cousins = new ArrayList<>();
		read(fileName);
		String father = null;
		for (String key : fatherSon.keySet()) {
			if (fatherSon.get(key).contains(name)) {
				father = key;
				break;
			}
		}
		if (father == null) {
            return cousins; 
        }
		
		 String grandfather = null;
	        for (String key : fatherSon.keySet()) {
	            if (fatherSon.get(key).contains(father)) {
	                grandfather = key;
	                break;
	            }
	        }
	        if (grandfather == null) {
	            return cousins;
	        }
	        HashSet<String> uncles = fatherSon.get(grandfather);
	        for(String uncle: uncles){
	        	 if (!uncle.equals(father)) {
	                 cousins.addAll(fatherSon.getOrDefault(uncle, new HashSet<>()));
	             }
	        }
	        HashSet<String> fatherChildren = fatherSon.get(father);
	        for (String cousin : new ArrayList<>(cousins)) {
	            if (fatherChildren.contains(cousin) || cousin.equals(name)) {
	                cousins.remove(cousin);
	            }
	        }
	        return cousins;
	}

	private void read(String fileName) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			while (true) {
				String newLine = reader.readLine();
				if (newLine == null) {
					return;
				}
				String[] names = newLine.split(" ");
				if (names.length == 2) {
					String child = names[0];
					String father = names[1];
					fatherSon.putIfAbsent(father, new HashSet<>());
					fatherSon.get(father).add(child);
				}
			}

		} catch (IOException e) {
			return;
		}
	}

}
