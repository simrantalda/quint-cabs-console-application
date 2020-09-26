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

	
	public Cab processRequest(Client c) {
		
		//load cabs
		List<Cab> cabs = InitialSetup.loadCabs();
		//filter only avaiable cabs
		//for future scaling we can filter cabs avaiable in particular radius
		cabs = cabs.stream().filter(cab -> cab.getStatus().equals("AVAILABLE") && cab.getCabType().equals(c.getCabType())).collect(Collectors.toList());	
		Cab cab = findNearestCab(cabs, c.getX(), c.getY());	
		return cab;
		
	}


	public  Cab  findNearestCab(List<Cab> cabs, double x, double y) {
		// TODO Auto-generated method stub
		Cab cab = new Cab();
		//apply k-nearest algorithm to find ride
		return cab;
		
	}
	
}
