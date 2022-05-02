package src;

import java.util.Objects;

public class Radio {
	private boolean isOn;
	private int volume;
	private double frequency;
	private double MIN_AM_FREQUENCY = 148.5 * 1000 /*Hz*/;
	private double MAX_AM_FREQUENCY = 26.1 * 1_000_000 /*Hz*/;
	private double MIN_FM_FREQUENCY = 87.5 * 1_000_000 /*Hz*/;
	private double MAX_FM_FREQUENCY = 108.0 * 1_000_000 /*Hz*/;
	private double minFrequency = MIN_AM_FREQUENCY;
	private double maxFrequency = MAX_AM_FREQUENCY;
	
	public Radio () {
	}
	
	public Radio (double frequency) {
		this.frequency = frequency;
	}
	
	public Radio (String stationName) {
		this.frequency = stationNameToFrequency(stationName);
	}
	
	public Radio (Radio someRadio) {
		setFrequency(someRadio.frequency);
		setModulation(someRadio.getModulation());
		if (someRadio.isOn()) this.on();
		this.volume = someRadio.volume;
	}
	
	private Modulation modulation = Modulation.AM;
	
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
	
	public Modulation getModulation() {
		return modulation;
	}

	public void setModulation(Modulation modulation) {
		this.modulation = Objects.requireNonNull(modulation);
		this.minFrequency = modulation == Modulation.AM ? MIN_AM_FREQUENCY : MIN_FM_FREQUENCY;
		this.maxFrequency = modulation == Modulation.AM ? MAX_AM_FREQUENCY : MAX_FM_FREQUENCY;
	}

	public void volumeUp() {
		changeVolume(1);
	}
	
	public void volumeDown() {
		changeVolume(-1);
	}
	
	
	public String radioToString() {
		System.out.println(minFrequency);
		return "Radio [Frequency = " + frequency  + modulation + " volume = " + volume + " is " +  (isOn ? "on" : "off") + "]";
	}
	
	public static double stationNameToFrequency(String stationName) {
		
		switch (stationName.trim().toLowerCase()) {
		case "walking the plank":
			return 98.3d;
		case RadioStations.SEA_101_STATION_NAME:
			return RadioStations.SEA_101_FREQUENCY;
		default:
			return 0.0d;
		}
	}
}
