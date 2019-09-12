import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		  // Test Clases
		  AirportsDB db1 = new AirportsDB();
		  Airport a1 = new Airport("JFK","KENNEDY AIRPORT","USA"); 
		  Airport a2 = new Airport("BAL","BALI AIRPORT","BALI"); 
		  db1.addAirport(a1);
		  db1.addAirport(a2);
		  System.out.println(db1);
		  //System.out.println(a1+""+a2); 
		  PlanesDB db2 = new PlanesDB();
		  Plane p1 = new Plane("HA-PAC",200); 
		  Plane p2 = new Plane("JSP-UC",170);
		  db2.Addplane(p1);
		  db2.Addplane(p2);
		  System.out.println(db2);
		  /*System.out.println(p1+""+p2); 
		  Flight f1 = new Flight(p1,a1,a2);
		  System.out.println(f1);*/
		  FlightsDB f1 = new FlightsDB();
		  f1.Addflight(new Flight(p1,a1,a2));
		  System.out.println(f1);
		Scanner reader = new Scanner(System.in);
		Menu.menuCreate(reader,  db1, f1,db2);
	}
}
