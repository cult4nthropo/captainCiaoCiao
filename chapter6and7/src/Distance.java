package src;

public interface Distance {
	
	static Distance ofMeter(int value) {
		return new DistanceImplementation(value);
	}
	
	//if the distance is given in kilometer
	static Distance ofKilometer(int value) {
		return new DistanceImplementation(value * 1000);
	}
	
	int meter();
	
	default int kilometer() {
		return meter()/1000;
	}
}
