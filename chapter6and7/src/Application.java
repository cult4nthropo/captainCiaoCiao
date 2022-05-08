package src;

import java.util.Comparator;
import java.util.Timer;

public class Application {

	public static void main(String[] args) {

		/*
		 * The solution in the book gives a compilation error There the
		 * FreeDiskSpaceTimerTask is only implementet with standard constructor and run
		 * gives void new Timer().schedule(new FreeDiskSpaceTimerTask().run(),(long)0,
		 * REPETITION_PERIOD); The first parameter has to be a TimerTask so I put the
		 * method in the constructor
		 */
		/*
		 * final long REPETITION_PERIOD = 2000L //ms; new Timer().schedule(new
		 * FreeDiskSpaceTimerTask(),(long)0, REPETITION_PERIOD);
		 */
		/*
		 * Test the electronic devices and add devices methods Radio radio = new
		 * Radio(); Radio radio1 = new Radio(); IceMachine iceMachine = new
		 * IceMachine(); radio.on(); radio.volumeUp(); radio.volumeUp();
		 * radio.setFrequency(98.8d); System.out.println(radio.radioToString());
		 * radio.volumeUp(); radio.setModulation(Modulation.FM);
		 * System.out.println(radio.radioToString()); Tracer.on();
		 * Tracer.trace("Start"); int i = 2; Tracer.off(); Tracer.trace("i = %d", i);
		 * Tracer.on(); Tracer.trace("End");
		 * 
		 * Ship ship = new Ship(); ship.addDevices(radio, radio1, iceMachine);
		 * System.out.print(ship.shipToString()); int switchedOn =
		 * ElectronicDevice.numberOfDevicesSwitchedOn(radio, radio1, iceMachine);
		 * System.out.printf(" %d of them switched on.\n", switchedOn); Firebox fb = new
		 * Firebox(); System.out.println(fb.isOn()); fb.off();
		 */
		/*
		 * Test the tube -> tv association TV tv = new TV(); tv.off(); tv.on();
		 */
		Ship ship = new Ship();
		ElectronicDevice ea1 = new Radio();
		ea1.setWatt(200);
		ElectronicDevice ea2 = new Radio();
		ea2.setWatt(20);
		TV grandpasTv = new TV();
		grandpasTv.setWatt(1000);
		Comparator<ElectronicDevice> comparator = new ElectronicDeviceWattComparator();
		System.out.println(comparator.compare(ea1, ea2));
		System.out.println(comparator.compare(ea2, ea1));
		ship.addDevices(ea1);
		ship.addDevices(ea2);
		ship.addDevices(grandpasTv);
		System.out.println(ship.findMostPowerConsumingElectronicDevice().getWatt());
	}

}
