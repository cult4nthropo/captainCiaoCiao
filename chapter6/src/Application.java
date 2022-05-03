package src;

public class Application {

	public static void main(String[] args) {

		Radio radio = new Radio();
		Radio radio1 = new Radio();
		IceMachine iceMachine = new IceMachine();
		radio.on();
		radio.volumeUp();
		radio.volumeUp();
		radio.setFrequency(98.8d);
		System.out.println(radio.radioToString());
		radio.volumeUp();
		radio.setModulation(Modulation.FM);
		System.out.println(radio.radioToString());
		Tracer.on();
		Tracer.trace("Start");
		int i = 2;
		Tracer.off();
		Tracer.trace("i = %d", i);
		Tracer.on();
		Tracer.trace("End");
		
		Ship ship = new Ship();
		ship.addDevices(radio, radio1, iceMachine);
		System.out.print(ship.shipToString());
		int switchedOn = ElectronicDevice.numberOfDevicesSwitchedOn(radio, radio1, iceMachine);
		System.out.printf(" %d of them switched on.\n", switchedOn);
		Firebox fb = new Firebox();
		System.out.println(fb.isOn());
		fb.off();

		
		TV tv = new TV();
		tv.off();
		tv.on();
		
	}

}
