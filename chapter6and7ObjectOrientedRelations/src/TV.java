package src;

public class TV extends ElectronicDevice {

	private final MonitorTube monitorTube = new MonitorTube(this);

	public TV() {

	}

	@Override
	public void on() {
		super.on();
		System.out.println("TV is on");
		monitorTube.on();
	}

	@Override
	public void off() {
		super.off();
		System.out.println("TV is off");
		monitorTube.off();
	}

	@Override
	public String toString() {
		return super.toString() + String.format("TV [on?=%s]", "is on");
	}
}
