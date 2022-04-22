package src;

public class Application {

	public static void main(String[] args) {

		Radio radio = new Radio();
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

	}

}
