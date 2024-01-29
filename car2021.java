import acm.util.RandomGenerator;

public class car2021 {
	private static final double KILOMETERS_PER_LITER = 2.3;
	private double gas;
	private double kms;
	private boolean isBroken;
	private RandomGenerator rgen;

	// კონსტრუქტორი
	public car2021(int gas, int kms) {
		this.gas = gas;
		this.kms = kms;
		isBroken = false;
		rgen = RandomGenerator.getInstance();
	}

	// ცდილობს დაიქოქოს და გაიაროს
	public boolean turnOnAndDrive(int kmsToDrive) {
		if (!starting()) {
			isBroken = true;
			return false;
		}
		double gasNeeded = kmsToDrive / KILOMETERS_PER_LITER;
		if(gasNeeded <= gas) {
			gas = gas - gasNeeded;
			kms += kmsToDrive;
			return true;
		} 
		    kms += gas * KILOMETERS_PER_LITER;
			gas = 0;
		return true;
	}

	private boolean starting() {
		if (kms < 10000) {
			return rgen.nextBoolean(0.9);
		} else if (kms < 20000) {
			return rgen.nextBoolean(0.8);
		} else if (kms < 30000) {
			return rgen.nextBoolean(0.7);
		} else if (kms < 40000) {
			return rgen.nextBoolean(0.6);
		} else if (kms < 50000) {
			return rgen.nextBoolean(0.5);
		} else if (kms < 60000) {
			return rgen.nextBoolean(0.4);
		} else if (kms < 70000) {
			return rgen.nextBoolean(0.3);
		} else if (kms < 80000) {
			return rgen.nextBoolean(0.2);
		} else if (kms < 90000) {
			return rgen.nextBoolean(0.1);
		}
		return false;
	}

	// აბრუნებს რამდენი კილომეტრი აქვს გავლილი მანქანას
	public int getMileage() {
		return (int) kms;
	}

	// აბრუნებს true-ს თუ მანქანა გაფუჭებულია, თუ არა false-ს
	public boolean isBrokenDown() {
		return isBroken;
	}

	// შეაკეთებს მანქანას, ანუ მანქანა აღარ იქნება გაფუჭებული და შეეძლება
	// გადაადგილება
	public void repair() {
		isBroken = false;
	}

	// დაამატებს შესაბამისი რაოდენობის ბენზინს მანქანის ავზს.
	public void fillGas(double numberOfLiters) {
		gas += numberOfLiters;
	}
}