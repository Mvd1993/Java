import java.util.Scanner;

public class UtilsCreate {

	public static void printMenuCreate() {
		System.out.println("Tria l'operació");
		System.out.println("[1] Afegeix un avió");
		System.out.println("[2] Afegeix un vol");
		System.out.println("[x] Sortida");
		}
	public static String ask(Scanner reader) { 
				
		//get the user answer
		String option = reader.nextLine();
		
		return option;
	}
	public static String askForName(Scanner reader) {
		System.out.println("Doneu un nom: ");
		return reader.nextLine();
	}
	
	public static int askForCapacity(Scanner reader) {
		System.out.println("Capacitat: ");
		return reader.nextInt();
	}
	
	public static Plane askForPlane(Scanner reader, PlanesDB planesDB) {
		String name = askForName(reader);
		for (Plane plane : planesDB.getPlanesDB())
			
			if (plane.getId().equals(name)) {
				return plane;
			}
			
		return null;		
	}
	
	public static Airport askForAirport(Scanner reader, AirportsDB airportsDB) {
		String name = askForName(reader);
		for (Airport airport : airportsDB.getAirportsDB())
			if (airport.getCode().equals(name)) {
				return airport;
			}
		
		
		return null;
	}
	
	public static void createPlane(Scanner reader, PlanesDB planesDB) {  
		//Ask for input data
		String name = askForName(reader);
		int capacity = askForCapacity(reader);
		
		//Create object Plane
		Plane plane = new Plane(name,capacity);
		planesDB.Addplane(plane);
		
	}
	public static void createFlight(Scanner reader, PlanesDB planesDB, AirportsDB airportsDB, FlightsDB flightsDB) {  
		//Ask for input data
		Plane plane = askForPlane(reader, planesDB);
		Airport departure = askForAirport(reader, airportsDB);
		Airport arrival = askForAirport(reader, airportsDB);
		Flight flight = new Flight(plane,departure,arrival);
		flightsDB.Addflight(flight);
		System.out.println(flight);
	}
}
