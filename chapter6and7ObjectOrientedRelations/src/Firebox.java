package src;

public class Firebox extends ElectronicDevice {

	public Firebox() {
		on();
	}

	@Override
	public void off() {
		System.out.println("A firebox is always on - you can't switch it off.");
	}
}
