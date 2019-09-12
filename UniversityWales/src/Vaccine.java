public class Vaccine {
	String name;
	int periodicity;
	Double price;
	
	public Vaccine(String name, int periodicity, Double price){
		name = this.name;
		periodicity = this.periodicity;
		price = this.price;
				
	}
	public Vaccine(String name, Double price){
		name = this.name;
		periodicity = 0;
		price = this.price;
				
	}
	//----geters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPeriodicity() {
		return periodicity;
	}
	public void setPeriodicity(int periodicity) {
		this.periodicity = periodicity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	//---tostring----
	@Override
	public String toString() {
		return "Vaccine [name=" + name + ", periodicity=" + periodicity + ", price=" + price + "]";
	}
	
}
