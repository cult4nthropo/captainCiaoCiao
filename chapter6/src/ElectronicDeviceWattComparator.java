package src;

public class ElectronicDeviceWattComparator implements java.util.Comparator<ElectronicDevice> {

	@Override
	public int compare(ElectronicDevice o1, ElectronicDevice o2) {

		System.out.println(o1 + "is compared to" + o2);
		return Double.compare(o1.getWatt(), o2.getWatt());
	}

}
