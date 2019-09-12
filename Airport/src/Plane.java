
public class Plane {

	String id;
	int capacity;
	public Plane (String id, int capacity) {
		this.id = id;
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return id + "(" + capacity + "persones)";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
