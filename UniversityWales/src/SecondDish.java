
public class SecondDish extends Food {
	

	public SecondDish(String name, Double price){
		this.name = name;
		this.price=price;
		
	}
	
	@Override
	public String toString() {
		return "SecondDish [name=" + name + ", price=" + price + "]";
	}
}
