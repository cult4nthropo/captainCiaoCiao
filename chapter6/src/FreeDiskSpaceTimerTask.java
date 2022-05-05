package src;

public class FreeDiskSpaceTimerTask extends java.util.TimerTask {

	private final long MIN_CAPACITY = 100_000_000_000L;

	FreeDiskSpaceTimerTask() {
		this.run();
	}

	@Override
	public void run() {

		long freeDiskSpace = java.io.File.listRoots()[0].getFreeSpace();
		if (freeDiskSpace < MIN_CAPACITY) {
			System.out.printf("You need a new disk. %d Byte remaining.\n", freeDiskSpace);
		} else {
			System.out.printf("%d Byte remaining.\n", freeDiskSpace);
		}
	}

}
