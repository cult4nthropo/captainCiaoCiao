package src;

public class Radio {
	private boolean isOn;
	private int volume;
	private double frequency;
	
	public boolean isOn() {
		return isOn;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	private void changeVolume(int value) {
		if ((volume + value) < 100 && (volume + value) > 0) {
			this.volume += value;
		}
	}
	
	public void on() {
		isOn = true;
	}
	
	public void off() {
		isOn = false;
	}
	
	public void volumeUp() {
		changeVolume(1);
	}
	
	public void volumeDown() {
		changeVolume(-1);
	}
	
	
	public String radioToString() {
		return "Radio [Frequency = " + frequency + " volume = " + volume + " is " +  (isOn ? "on" : "off") + "]";
	}
	
	public static double stationNameToFrequency(String stationName) {
		
		switch (stationName.trim().toLowerCase()) {
		case "walking the plank":
			return 98.3d;
		default:
			return 0.0d;
		}
	}
}
