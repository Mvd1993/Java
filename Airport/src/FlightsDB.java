import java.util.ArrayList;

public class FlightsDB {
	private ArrayList<Flight> flightsDB;
	
	public FlightsDB() {
		flightsDB = new ArrayList<Flight>();
	}
	
	
	@Override
	public String toString() {
		return "FlightsDB [flightsDB=" + flightsDB + "]";
	}


	public ArrayList<Flight> getFlightsDB() {
		return flightsDB;
	}
	public void Addflight(Flight flight) {
		this.getFlightsDB().add(flight);
	}
	
}
