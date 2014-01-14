import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Weektest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(WeekDayEnum.getDayOfWeek(Calendar.getInstance().get(
				Calendar.DAY_OF_WEEK)));
		System.out.println(String.valueOf(Long.MAX_VALUE).length());
		Long l = new Long(100);
		int d = -2;
		long s = 100;
		Integer f = new Integer(4);
		double dd = Double.parseDouble("0");
		System.out.println(l == 0);
		System.out.println(l == s);
		System.out.println(dd);
		Set<String> setall = new HashSet<String>();
		setall.add("12");
		setall.add("11");
		setall.add("34");
		List<String> seta = new ArrayList<String>();
		seta.add("12");
		seta.add("11");
		seta.add("10");
		setall.removeAll(seta);
		System.out.println(setall);
		// String address = "12-53";
		String address = "12 53";
		String[] partAddress = address.split("[ -]");
		for (String part : partAddress) {
			System.out.println(part);
		}
		String str = "Null";
		System.out.println(str.equalsIgnoreCase("NULL"));
		// System.out.println(partAddress);
	}

}
