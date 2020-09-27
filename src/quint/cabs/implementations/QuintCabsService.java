/**
 * 
 */
package quint.cabs.implementations;

import java.util.List;
import java.util.stream.Collectors;
import quint.cabs.beans.Cab;
import quint.cabs.beans.Client;
import quint.cabs.beans.RideDetails;

/**
 * @author Simran Talda
 *
 */
public class QuintCabsService {

	/**
	 * processRequest - process client request
	 * 
	 * @param c
	 * @return
	 */
	public RideDetails processRequest(Client c) {

		// load cabs
		List<Cab> cabs = InitialSetup.loadCabs();
		// filter only avaiable cabs
		// for future scaling we can filter cabs avaiable in particular radius
		cabs = cabs.stream()
				.filter(cab -> cab.getStatus().equals("AVAILABLE")
						&& cab.getCabType().equals(c.getCabType()))
				.collect(Collectors.toList());
		// find nearest cab
		return findNearestCab(cabs, c.getX(), c.getY());
	}

	/**
	 * findNearestCab- pre-processing and creating data sets for knn algo
	 * 
	 * @param cabs
	 * @param x
	 * @param y
	 * @return
	 */
	public RideDetails findNearestCab(List<Cab> cabs, double x, double y) {
		// Cab cab = new Cab();
		double minDistance = Double.MAX_VALUE;
		Cab nearestCab = null;
		for (Cab cab : cabs) {
			double distance = knnAlgorithm(x, y, cab.getX(), cab.getY());
			if (minDistance > distance || distance == 0) {
				nearestCab = cab;
				minDistance = distance;
			}
		}

		return (nearestCab != null)
				? setRideDetails(nearestCab, minDistance)
				: null;

	}

	/**
	 * setRideDetails - calculate time and cost for ride
	 * 
	 * @param cab
	 * @param minDistance
	 * @return
	 */
	public RideDetails setRideDetails(Cab cab, double minDistance) {
		// set ride details
		RideDetails ride = new RideDetails();
		ride.setCabId(cab.getCabId());
		double cost = 0;
		ride.setTimeTaken(minDistance / InitialSetup.getBasicSpeed());
		if (ride.getTimeTaken() <= 1) {
			cost = InitialSetup.getCostPerMinute();
		} else {
			cost = InitialSetup.getCostPerKm();
		}
		if(cab.getCabType() == "PINK") {
			cost+= InitialSetup.getAdditionalCost();
		}
		
		ride.setCost(cost);

		return ride;
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
