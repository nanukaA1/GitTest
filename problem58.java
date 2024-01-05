import acm.program.ConsoleProgram;

public class problem58 extends ConsoleProgram{
	public void run() {
		int[][] matrix = {
				{1, 2, 3},
				{9, 7, 8},
				{4, 5, 6}};
		println(isMagical(matrix));
	}

	private boolean isMagical(int[][] matrix) {
		int n = matrix.length;
		for(int i = 1; i <= Math.pow(n, 2); i++) {
			if(!contains(matrix, i)){
				return false;
			}
		}
		return true;
	}

	private boolean contains(int[][] matrix, int num) {
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix.length; j++){
				if(matrix[i][j] == num){
					return true;
				}
			}
		}
		return false;
	}
}
