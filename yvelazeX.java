import java.util.HashSet;
import java.util.Iterator;

import acm.program.ConsoleProgram;

public class yvelazeX extends ConsoleProgram{
	HashSet<Integer> xSizes = new HashSet<>();
	public void run() {
		int[][] m = {
	            { 0, 1, 0, 0, 1},
	            { 1, 1, 1, 0, 1},
	            { 0, 1, 0, 0, 1},
	            { 1, 1, 1, 1, 1},
	            { 0, 1, 1, 0, 1},
	            { 0, 1, 0, 0, 1},
	            { 0, 1, 0, 0, 1}
	        };
		findXs(m);
	}

	private void findXs(int[][] m) {
		for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == 1) {
                    int size = findX(m, i, j, m.length, m[0].length);
                    xSizes.add(size);
                }
            }
        }
        println(maxHashSet());
	}

	private int maxHashSet() {
		Iterator<Integer> iterator = xSizes.iterator();
        int max = 0;

        while (iterator.hasNext()) {
            int current = iterator.next();
            if (current > max) {
                max = current;
            }
        }

        return max;
	}

	private int findX(int[][] m, int i, int j, int rows, int cols) {
		 int size = 1;
	     int left = j - 1, right = j + 1, up = i - 1, down = i + 1;
	     while(left >= 0 && right < cols && up >= 0 && down < rows && m[up][left] == 1 && m[up][right] == 1
	                && m[down][left] == 1 && m[down][right] == 1) {
	    	 size++;
	            left--;
	            right++;
	            up--;
	            down++;
	     }
	     return size;
	}
}
