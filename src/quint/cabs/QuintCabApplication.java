package quint.cabs;

import java.util.Scanner;

import quint.cabs.beans.Cab;
import quint.cabs.beans.Client;
import quint.cabs.beans.RideDetails;
import quint.cabs.implementations.QuintCabsService;

/**
 * @author Simran Talda
 *
 */
public class QuintCabApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Quint Cabs!!!");

		try (// Get Clients
				Scanner in = new Scanner(System.in)) {
			do {
				System.out.print("Enter Cleint Details");
				System.out.print("Enter Cleint id");
				final Client c = new Client();
				c.setClientId(in.nextInt());
				System.out.print("Enter current x and y");
				c.setX(in.nextDouble());
				c.setY(in.nextDouble());
				System.out.print("Enter destination x and y");
				c.setDestinationX(in.nextDouble());
				c.setDestinationY(in.nextDouble());
				System.out.print("Do you want pink cab? (NORMAL/PINK)");
				c.setCabType(in.next());

				// processRequest
				final QuintCabsService service = new QuintCabsService();
				final RideDetails ride = service.processRequest(c);
				// showCabDetails(cab);
				if (ride != null) {
					showRideDetails(ride);
					System.out.print("Do you wish to Proceed? (Y/N)");
					if (in.next().equals("Y")) {
						service.startRide(ride, c.getDestinationX(),c.getDestinationY());
					}
				} else {
					System.out.print("Sorry!! no rides avaiable ");
				}

			} while (in.next().equals("END_NOW"));
		}

		// find nearest cab

		// complete ride

	}

	/**
	 * showRideDetails - get ride deatils
	 * 
	 * @param ride
	 */
	public static void showRideDetails(RideDetails ride) {
		System.out.print("Here is your ride !!!");
		System.out.println("Cab No - " + ride.getCabId());
		System.out.println("Time Estimated  - " + ride.getTimeTaken());
		System.out.println("Cos Estimated - " + ride.getCost());
	}

	/**
	 * showCabDetails
	 * 
	 * @param cab
	 */
	public static void showCabDetails(Cab cab) {
		System.out.print("Here is your ride !!!");
		System.out.println("Cab No - " + cab.getCabId());
		System.out.println(
				"Cab's current location " + cab.getX() + " - " + cab.getY());
	}

}
