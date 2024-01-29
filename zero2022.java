import acm.program.ConsoleProgram;

public class zero2022 extends ConsoleProgram {
	public void run() {
		int[][] m = { { 1, 2, 3 }, { 0, 7, 8 }, { 4, 5, 6 } };
		zero(m);
	}

	private void zero(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				if (m[i][j] == 0) {
					int curri = i;
					int currj = j;
					for (int l = 0; l < m.length; l++) {
						for (int x = 0; x < m[0].length; x++) {
							m[curri][x] = 0;
							m[l][currj] = 0;
						}
					}
				}
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				print(m[i][j] + " ");
			}
			println();
		}
	}
}
