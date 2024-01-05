import acm.program.ConsoleProgram;

public class problem49 extends ConsoleProgram {
	public void run() {
		String numStr = "56875";
		int num = stringToInteger(numStr);

		println(num);
	}

	private int stringToInteger(String numStr) {
		int num = 0;
		for (int i = 0; i < numStr.length(); i++) {
			num = num * 10 + (numStr.charAt(i) - '0');
		}
		return num;
	}
}