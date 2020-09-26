package quint.cabs;

import java.util.List;
import java.util.Scanner;

import quint.cabs.beans.Cab;
import quint.cabs.beans.Client;
import quint.cabs.implementations.InitialSetup;
import quint.cabs.implementations.QuintCabsService;

public class QuintCabApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Quint Cabs!!!");
		
		//Get Clients
        Scanner in = new Scanner(System.in);  
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
        		
		//processRequest
        QuintCabsService service = new QuintCabsService();
        service.processRequest(c);
        
		//find nearest cab
		
		//complete ride
		
		
		
	}


}
