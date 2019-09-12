
public class Flight {
	Plane plane;
	Airport departure;
	Airport arrival;
	public Flight (Plane plane, Airport departure, Airport arrival) {
		this.plane = plane;
		this.departure = departure;
		this.arrival = arrival;
	}
	@Override
	public String toString() {
		return plane + "(" + departure.code + "-" + arrival.code + ")";
	}
	public Plane getPlane() {
		return plane;
	}
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	public Airport getDeparture() {
		return departure;
	}
	public void setDeparture(Airport departure) {
		this.departure = departure;
	}
	public Airport getArrival() {
		return arrival;
	}
	public void setArrival(Airport arrival) {
		this.arrival = arrival;
	}
	
}
