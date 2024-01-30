import java.util.HashSet;

import acm.program.ConsoleProgram;

public class countAB2018 extends ConsoleProgram {
	private HashSet<String> uniqueStrings = new HashSet<>();
	public void run() {
		println(countAB("ababaa"));
	}

	private int countAB(String string) {
		for(int i = 0; i < string.length(); i++) {
			for(int j = i+2; j <= string.length(); j++){
				String substring = string.substring(i, j);
				if(countA(substring) == countB(substring)){
					uniqueStrings.add(substring);
				}
			}
		}
		return uniqueStrings.size();
		
	}

	private int countA(String substring) {
		int count = 0;
		for(int i = 0; i< substring.length();i++) {
			if(substring.charAt(i) =='a') {
				count++;
			}
		}
		return count;
	}

	private int countB(String substring) {
		int count = 0;
		for(int i = 0; i< substring.length();i++) {
			if(substring.charAt(i) =='b') {
				count++;
			}
		}
		return count;
	}
}
