package src;

public class Application {

	public static void main(String[] args) {

		Radio radio = new Radio();
		Radio radio1 = new Radio();
		Radio radio2 = new Radio(0);
		radio.on();;
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
		ship.addRadios(radio, radio1, radio2);
		System.out.println(ship.shipToString());

		/*
		TV tv = new TV();
		tv.off();
		tv.isOn();
		*/
	}

}
