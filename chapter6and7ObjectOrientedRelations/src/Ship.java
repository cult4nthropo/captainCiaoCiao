package src;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Ship {
	private ArrayList<ElectronicDevice> device = new ArrayList<ElectronicDevice>();
	static final int MAX_CONSUMPTION = 1000;

	static class ElectronicDeviceWattComparator implements java.util.Comparator<ElectronicDevice> {

		@Override
		public int compare(ElectronicDevice o1, ElectronicDevice o2) {

			System.out.println(o1 + "is compared to" + o2);
			return Double.compare(o1.getWatt(), o2.getWatt());
		}

	}

	public ArrayList<ElectronicDevice> addDevices(ElectronicDevice... devices) {
		
		for (ElectronicDevice device : devices) {

			try {
				Radio radio = (Radio) device;
				if (radio.getVolume() < 1) {
					this.device.add(radio);
					System.out.println("Radio added, already payed GEZ?");
				} else {
					continue;
				}
			} catch (Exception e) {
			}

			/*
			 * Why this one does not continue with the loop? It adds the radio despite
			 * volume == 0 if ( device instanceof Radio) { if (((Radio)device).getVolume()
			 * == 0) { continue; } else { this.device.add(device);
			 * System.out.printf("Radio added, already payed GEZ?\n"); } }
			 */

			this.device.add(device);
			final ElectronicDeviceWattComparator WATT_COMPARATOR = new ElectronicDeviceWattComparator();
			this.device.sort(WATT_COMPARATOR);
		}

		return this.device;
	}

	public int numberOfDevicesOnBord() {
		return device.size();
	}

	public void prepareForHoliday() {
		for (ElectronicDevice devices : device) {
			devices.off();
		}
	}

	public ElectronicDevice findMostPowerConsumingElectronicDevice() {
		ElectronicDevice maxConsuming = java.util.Collections.max(this.device, new ElectronicDeviceWattComparator());
		System.out.println(
				"The most consuming device is " + maxConsuming + " with " + maxConsuming.getWatt() / 1000 + "kW.");
		return maxConsuming;
	}

	public void removePowerConsumingDevices() {
		class PowerConsumingDevice implements Predicate<ElectronicDevice> {
			@Override
			public boolean test(ElectronicDevice electronicDevice) {
				return electronicDevice.getWatt() > MAX_CONSUMPTION;
			}
		}
		device.removeIf(new PowerConsumingDevice());
	}

	public String ShipToString() {
		return String.format("There are %d devices on board.", numberOfDevicesOnBord());
	}

}
