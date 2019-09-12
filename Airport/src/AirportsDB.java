import java.util.ArrayList;

public class AirportsDB {
	private ArrayList<Airport> airportsDB;
	
	public  AirportsDB() {
		airportsDB = new ArrayList<Airport>();
	}

	@Override
	public String toString() {
		return "AirportsDB [airportsDB=" + airportsDB + "]";
	}

	public ArrayList<Airport> getAirportsDB() {
		return airportsDB;
	}

	public void addAirport(Airport airport) {
		this.getAirportsDB().add(airport);
	}

	
	
	
}
