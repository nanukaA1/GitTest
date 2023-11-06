import acm.program.ConsoleProgram;

public class problem15 extends ConsoleProgram{
	public void run() {
		int firstNum = readInt("Enter First Number: ");
		int secondNum = readInt("Enter Second Number: ");
		calculateAverage(firstNum, secondNum);
		}
	
	private void calculateAverage(int x, int y) {
		double average = (x + y) / 2.0;
		println(average);
	}
}
