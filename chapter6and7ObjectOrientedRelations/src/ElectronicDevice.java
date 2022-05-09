package src;

public class ElectronicDevice {

	private boolean isOn;

	private int watt;

	public boolean isOn() {
		return isOn;
	}

	public void on() {
		isOn = true;
	}

	public void off() {
		isOn = false;
	}

	public int getWatt() {
		return watt;
	}

	public void setWatt (int watt) throws IllegalWattException {
		if (watt <= 0) {
			throw new IllegalWattException("%d is no valid input. Watt has to be bigger than 0", watt);
		}
		this.watt = watt;
	}

	public static int numberOfDevicesSwitchedOn(ElectronicDevice... devices) {
		int result = 0;
		for (ElectronicDevice device : devices) {
			if (device.isOn()) {
				result++;
			}
		}
		return result;
	}

	public String toString() {
		return "Electronic Device [watt = " + watt / 1000 + "kW]";
	}
}
