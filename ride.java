import java.util.ArrayList;

public class ride {
	private String name;
	private String category;
	private ArrayList<String> guestsOnRide;
	private boolean isWorking;

	public ride(String name, String type) {
		this.name = name;
		this.category = type;
	}

	public void enterRide(String name) {
		guestsOnRide.add(name);
	}

	public boolean exitRide(String name) {
		return guestsOnRide.remove(name);
	}

	public int getNumGuests() {
		return guestsOnRide.size();
	}

	public boolean getWorkingStatus() {
		return this.isWorking;
	}

	public void setWorkingStatus(boolean status) {
		isWorking = status;
	}

	public String toString(boolean status) {
		return this.name + ":type=" + this.category + ", isWorking=" + this.isWorking + " guestsOnRide="
				+ this.guestsOnRide;
	}
}
