package src;

import java.util.ArrayList;

public class Ship {
	private ArrayList<Radio> radios = new ArrayList<Radio>();
	
	public ArrayList<Radio> addRadios(Radio ... radios) {
		for (Radio radio : radios) {
			this.radios.add(radio);
		}
		
		return this.radios;
	}
	
	public int numberOfRadiosOnBord() {
		return radios.size();
	}
	
	public int numberOfRadiosSwitchedOn () {
		int result = 0;
		for (Radio radio : radios) {
			if (radio.isOn()) {
				result++;}
			}
		return result;
	}
	
	public String shipToString() {
		return String.format("There are %d radios on board and %d of them switched on.", numberOfRadiosOnBord(), numberOfRadiosSwitchedOn());	}
}
