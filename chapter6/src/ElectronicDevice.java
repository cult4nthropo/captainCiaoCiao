package src;

public class ElectronicDevice {
	
	private boolean isOn;
	
	public boolean isOn() {
		return isOn;
	}
	
	public void on() {
		isOn = true;
	}
	
	public void off() {
		isOn = false;
	}
	
	public static int numberOfDevicesSwitchedOn (ElectronicDevice...devices) {
		int result = 0;
		for (ElectronicDevice device : devices) {
			if (device.isOn()) {
				result++;}
			}
		return result;
	}
}
