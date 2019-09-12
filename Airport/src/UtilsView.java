import java.util.Scanner;

public class UtilsView {
	public static void printMenuView() {
		System.out.println("Servei de vol");
		System.out.println("--- ---------");
		System.out.println("Seleccioneu operació:");
		System.out.println("[1] Imprimir avions");
		System.out.println("[2] Imprimir vols ");
		System.out.println("[3] Imprimir avió ");
		System.out.println("[x] Sortir ");

	}
	
	public static void printPlanes(PlanesDB planesDB) {
		for (Plane plane: planesDB.getPlanesDB()){
			System.out.println(plane);
		}
	}
	
	public static void printFlights(FlightsDB flightsDB) {
		for (Flight flight: flightsDB.getFlightsDB()){
			System.out.println(flight);
		}
	}
	
	public static void printEspecificPlane(Scanner reader, PlanesDB planesDB) {
		for (Plane plane: planesDB.getPlanesDB()) {
			if(plane.getId().equals(UtilsCreate.askForName(reader))) {
				System.out.println(plane);
				break;
			}
			
		}
		
	}
}
	
	
	
	 
	 
	 
	
	
	
	
	


