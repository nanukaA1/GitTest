import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import acm.program.ConsoleProgram;

public class sorting extends ConsoleProgram {
	public void run() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(readLine());
		list.add(readLine());
		list.add(readLine());
		Comparator<String> c = Comparator.comparing(String::length);
		list.sort(c);
		println(list);
		
		int[] arr = {5,6,7,8,9};
		Arrays.sort(arr);
		println(arr.toString());
	}
}
