package src;

public class Tracer {
	private static boolean tracingIsOn;
	
	public static void trace (String message) {
		if(tracingIsOn) {
			System.out.println(message);
		}
		
	}
	
	public static void trace (String format, Object...args) {
		if(tracingIsOn) {
			System.out.printf(format + "%n", args);
		}
	}

	public static void on() {
		tracingIsOn = true;
	}
	
	public static void off() {
		tracingIsOn = false;
	}
	
}
