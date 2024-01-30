import java.util.HashSet;
import java.util.Iterator;

import acm.program.ConsoleProgram;

public class yvelazeplis2018 extends ConsoleProgram {
	 HashSet<Integer> plusSizes = new HashSet<>();
	public void run() {
		int[][] m = {{00000100},
					 {00001110},
					 {00100100},
					 {01111111},
					 {00100110},
					 {00100100}};
		
		findPlus(m);

	}

	private void findPlus(int[][] m) {
		 int rows = m.length;
	        int cols = m[0].length;
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (m[i][j] == 1) {
	                    int size = findPlus(m, i, j, rows, cols);
	                    plusSizes.add(size);
	                }
	            }
	        }
	        println(maxHashSet());
	}

	private int maxHashSet() {
		 Iterator<Integer> iterator = plusSizes.iterator();
	        int max = Integer.MIN_VALUE; 

	        while (iterator.hasNext()) {
	            int current = iterator.next();
	            if (current > max) {
	                max = current;
	            }
	        }

	        return max;
	}

	private int findPlus(int[][] m, int i, int j, int rows, int cols) {
		 int size = 1;
	        int left = j - 1, right = j + 1, up = i - 1, down = i + 1;

	        while (left >= 0 && right < cols && up >= 0 && down < rows &&
	                m[i][left] == 1 && m[i][right] == 1 &&
	                m[up][j] == 1 && m[down][j] == 1) {
	            size++;
	            left--;
	            right++;
	            up--;
	            down++;
	        }

	        return size;
	}
}
