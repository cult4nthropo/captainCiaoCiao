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

	public void setWatt(int watt) {
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
