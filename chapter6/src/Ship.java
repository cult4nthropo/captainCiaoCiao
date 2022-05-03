package src;

import java.util.ArrayList;

public class Ship {
	private ArrayList<ElectronicDevice> device = new ArrayList<ElectronicDevice>();
	
	public ArrayList<ElectronicDevice> addDevices(ElectronicDevice ... devices) {
		for (ElectronicDevice device : devices) {
			//Radio radio = new Radio();
			try {
				Radio radio = (Radio)device;
				if (radio.getVolume() < 1) {
					this.device.add(radio);
					System.out.println("Radio added, already payed GEZ?");
				} else {
					continue;
				}
			} catch (Exception e) {continue;}
			
			/*Why this one does not continue with the loop? It adds the radio despite volume == 0
			 * if ( device instanceof Radio) {
				if (((Radio)device).getVolume() == 0) {
					continue;
				} else {
					this.device.add(device);
					System.out.printf("Radio added, already payed GEZ?\n");
				}
			}
			 */
			
			this.device.add(device);
		}
		
		return this.device;
	}
	
	public int numberOfDevicesOnBord() {
		return device.size();
	}
	
	public String shipToString() {
		return String.format("There are %d devices on board.", numberOfDevicesOnBord());	
		}
}
