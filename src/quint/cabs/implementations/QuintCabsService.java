/**
 * 
 */
package quint.cabs.implementations;

import java.util.List;
import java.util.stream.Collectors;
import quint.cabs.beans.Cab;
import quint.cabs.beans.Client;

/**
 * @author LENOVO
 *
 */
public class QuintCabsService {

	/**
	 * processRequest - process client request
	 * 
	 * @param c
	 * @return
	 */
	public Cab processRequest(Client c) {

		// load cabs
		List<Cab> cabs = InitialSetup.loadCabs();
		// filter only avaiable cabs
		// for future scaling we can filter cabs avaiable in particular radius
		cabs = cabs.stream()
				.filter(cab -> cab.getStatus().equals("AVAILABLE")
						&& cab.getCabType().equals(c.getCabType()))
				.collect(Collectors.toList());
		Cab cab = findNearestCab(cabs, c.getX(), c.getY());
		return cab;

	}

	/**
	 * findNearestCab- pre-processing and creating data sets for knn algo
	 * 
	 * @param cabs
	 * @param x
	 * @param y
	 * @return
	 */
	public Cab findNearestCab(List<Cab> cabs, double x, double y) {
		// Cab cab = new Cab();
		double minDistance = Double.MAX_VALUE;
		Cab nearestCab = null;
		for (Cab cab : cabs) {
			double distance = knnAlgorithm(x, y, cab.getX(), cab.getY());
			if (minDistance > distance || distance == 0) {
				nearestCab = cab;
			}
		}
		return (nearestCab != null) ? nearestCab : null;

	}

	/**
	 * knnAlgorithm - Getting the distance between two data elements bu using
	 * The K Nearest Neighbor Classifier
	 * 
	 * @param clientX
	 * @param clientY
	 * @param cabX
	 * @param cabY
	 * @return
	 */
	public double knnAlgorithm(double clientX, double clientY, double cabX,
			double cabY) {
		double term1 = (cabX - clientX) * (cabX - clientX);
		double term2 = (cabY - clientY) * (cabY - clientY);
		double sum = term1 + term2;
		return Math.abs(Math.sqrt(sum));
	}

}
