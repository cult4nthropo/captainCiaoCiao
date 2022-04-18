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
		System.out.println(radio.radioToString());

	}

}
