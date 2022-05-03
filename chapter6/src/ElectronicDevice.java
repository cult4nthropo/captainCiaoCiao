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
}
