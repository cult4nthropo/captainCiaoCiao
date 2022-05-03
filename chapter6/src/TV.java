package src;

public class TV {
	
	private boolean isOn;
	private final MonitorTube monitorTube = new MonitorTube(this);
	
	public TV () {
		
	}
	
	public void isOn() {
		this.isOn = true;
		System.out.println("TV is on");
		monitorTube.on();
	}
	
	public void off() {
		this.isOn = false;
		System.out.println("TV is off");
		monitorTube.off();
	}
	
	public String toString() {
		return String.format("TV [on?=%s]", "is on");
	}
}
