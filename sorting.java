import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		
		int[] arr = {90,17,7,80,9};
		Arrays.sort(arr);
		println(Arrays.toString(arr));
		
		String[] arr1 = { "lin", "linda", "lind"}
		Arrays.sort(arr1);
		println(Arrays.toString(arr1));
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(readInt());
		list1.add(readInt());
		list1.add(readInt());
		Collections.sort(list1);
		println(list1);
	}
}
