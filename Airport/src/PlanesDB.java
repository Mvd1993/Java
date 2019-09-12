import java.util.ArrayList;

public class PlanesDB {
	private ArrayList<Plane> planesDB;
	
	public PlanesDB() {
		planesDB = new ArrayList<Plane>();
	}
	@Override
	public String toString() {
		return "PlanesDB [planesDB=" + planesDB + "]";
	}
	public ArrayList<Plane> getPlanesDB() {
		return planesDB;
	}
	public void Addplane(Plane plane) {
		this.getPlanesDB().add(plane);
	}
	
}
