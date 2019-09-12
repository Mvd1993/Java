
public class FirstDish extends Food{
	public FirstDish(String name, Double price){
		this.name = name;
		this.price=price;
		
	}

	@Override
	public String toString() {
		return "FirstDish [name=" + name + ", price=" + price + "]";
	}
	
}
