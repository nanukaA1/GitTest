import acm.program.ConsoleProgram;

public class carTest extends ConsoleProgram {
	public void run() {
		testCar();
	}

	private void testCar() {
		car2021 myCar = new car2021(10, 0);
		while (!myCar.isBrokenDown()) {
			boolean drove = myCar.turnOnAndDrive(10);
			if (!drove && !myCar.isBrokenDown()) {
				myCar.fillGas(10);
				println("Gas needed, kms: " + myCar.getMileage());
			}
		}

		println(myCar.getMileage());
	}
}