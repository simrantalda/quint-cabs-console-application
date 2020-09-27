package quint.cabs;

import java.util.Scanner;

import quint.cabs.beans.Cab;
import quint.cabs.beans.Client;
import quint.cabs.implementations.QuintCabsService;

public class QuintCabApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Quint Cabs!!!");

		try (// Get Clients
				Scanner in = new Scanner(System.in)) {
			System.out.print("Enter Cleint Details");
			System.out.print("Enter Cleint id");
			Client c = new Client();
			c.setClientId(in.nextInt());
			System.out.print("Enter current x and y");
			c.setX(in.nextDouble());
			c.setY(in.nextDouble());
			System.out.print("Enter destination x and y");
			c.setDestinationX(in.nextDouble());
			c.setDestinationY(in.nextDouble());
			System.out.print("Do you want pink cab");
			c.setCabType(in.nextLine());

			// processRequest
			QuintCabsService service = new QuintCabsService();
			Cab cab = service.processRequest(c);
			showCabDetails(cab);
		}

		// find nearest cab

		// complete ride

	}

	/**
	 * showCabDetails
	 * @param cab
	 */
	private static void showCabDetails(Cab cab) {
		System.out.print("Here is your ride !!!");
		System.out.println("Cab No - " + cab.getCabId());
		System.out.println(
				"Cab's current location " + cab.getX() + " - " + cab.getY());
	}

}
