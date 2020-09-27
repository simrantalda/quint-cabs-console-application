package quint.cabs.implementations;

import java.util.ArrayList;
import java.util.List;
import quint.cabs.beans.Cab;

/**
 * @author Simran Talda
 *
 */
public class InitialSetup {

	/**
	 * loadCabs - fetch records from db (for now adding adding stubs)
	 */
	public static List<Cab> loadCabs() {
		List<Cab> cabs = new ArrayList<>();
		cabs.add(new Cab(1, 9.07, 5.0, "AVAILABLE", 0, "NORMAL"));
		cabs.add(new Cab(1, 8.999, 7.90, "AVAILABLE", 0, "NORMAL"));
		cabs.add(new Cab(1, 5.07, 8.90, "AVAILABLE", 0, "NORMAL"));
		cabs.add(new Cab(1, 7.07, 6.90, "AVAILABLE", 0, "NORMAL"));
		cabs.add(new Cab(1, 8.07, 9.0, "AVAILABLE", 0, "NORMAL"));
		cabs.add(new Cab(1, 9.07, 8.90, "AVAILABLE", 0, "NORMAL"));
		cabs.add(new Cab(1, 5.07, 6.50, "AVAILABLE", 0, "NORMAL"));
		cabs.add(new Cab(1, 6.07, 4.40, "AVAILABLE", 0, "NORMAL"));
		cabs.add(new Cab(1, 4.07, 3.05, "AVAILABLE", 0, "NORMAL"));
		cabs.add(new Cab(1, 9.07, 7.07, "AVAILABLE", 0, "NORMAL"));
		cabs.add(new Cab(1, 8.07, 9.07, "AVAILABLE", 0, "NORMAL"));
		cabs.add(new Cab(1, 2.07, 8.08, "AVAILABLE", 0, "NORMAL"));

		return cabs;
	}
	
	public static double getBasicSpeed() {
		return 40;
	}
	
	public static double getCostPerMinute() {
		return 1;
	}
	
	public static double getCostPerKm() {
		return 2;
	}
	
	public static double getAdditionalCost() {
		return 5;
	}

}
