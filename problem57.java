import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem57 extends ConsoleProgram {
	public void run() {
		String str1 = "acghh";
		String str2 = "hacgh";
		println(areAnagrams(str1, str2));
	}

	private boolean areAnagrams(String str1, String str2) {
		if(str1.equals(str2)) {
			return false;
		}
		int[] counts1 = getCount(str1);
		int[] counts2 = getCount(str2);
		
		println(Arrays.toString(counts1));
		println(Arrays.toString(counts2));
		
		return Arrays.equals(counts1, counts2);
	}
	
	private int[] getCount(String s) {
		int[] counts = new int[26];
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int index = ch - 'a';
			counts[index]++;
		}
		return counts;
	}
}