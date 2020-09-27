/**
 * 
 */
package quint.cabs.implementations.test;

import quint.cabs.beans.Client;
import quint.cabs.beans.RideDetails;
import quint.cabs.implementations.QuintCabsService;
import quint.cabs.utils.CabStatus;
import quint.cabs.utils.RideType;

/**
 * @author LENOVO
 *
 */
public class QuintCabsServiceTest {

	private QuintCabsService quintCabs = new QuintCabsService();;

	@Test
	public void processRequestTest1() {
		Client c = new Client();
		c.setClientId(1);
		c.setX(9.0);
		c.setY(90.8);
		c.setDestinationX(9999.9);
		c.setDestinationY(600606.9);
		c.setCabType(RideType.PINK.getRideType());
		RideDetails ride = quintCabs.processRequest(c);
		AssetEqual(ride.getCost(), 7);
	}

	@Test
	public void processRequestTest2() {
		Client c = new Client();
		c.setClientId(1);
		c.setX(98.0);
		c.setY(90.8);
		c.setDestinationX(90999.9);
		c.setDestinationY(909.9);
		c.setCabType(RideType.NORMAL.getRideType());
		RideDetails ride = quintCabs.processRequest(c);
		AssetEqual(ride.getCost(), 2);
	}

	@Test
	public void knnAlgorithmTest1() {
		double d = quintCabs.knnAlgorithm(6.77, 6.77, 67.777, 6767.66);
		AssetEqual(d, 2.16124);
	}

	@Test
	public void knnAlgorithmTest() {
		double d = quintCabs.knnAlgorithm(6.77, 6.77, 6.77, 6.77);
		AssetEqual(d, 0);
	}

}
