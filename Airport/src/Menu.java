import java.util.Scanner;

public class Menu {
	
	
	
	
	public static void menuCreate(Scanner reader, AirportsDB airportsDB, FlightsDB flightsDB, PlanesDB planesDB) {
		
		while (true){
			UtilsCreate.printMenuCreate();
			String selector = UtilsCreate.ask(reader);
			if (selector.equals("1")) {
				UtilsCreate.createPlane(reader, planesDB);
			}
			else if (selector.equals("2")) {
				UtilsCreate.createFlight(reader, planesDB, airportsDB, flightsDB);
			}
			else if (selector.equals("x")) {
				menuView(reader, airportsDB, flightsDB, planesDB );
				break;
			}
			
		}
	}
	
	public static void menuView(Scanner reader, AirportsDB airportsDB, FlightsDB flightsDB, PlanesDB planesDB) {
		while (true) {
			UtilsView.printMenuView();
			String selector = UtilsCreate.ask(reader);
			if (selector.equals("1")) {
				UtilsView.printPlanes(planesDB);
			}
			else if (selector.equals("2")) {
				UtilsView.printFlights(flightsDB);
			}
			else if (selector.equals("3")) {
				UtilsView.printEspecificPlane(reader, planesDB);
			}
			else if (selector.equals("x")) {
				break;
			}
		}
	}
}
