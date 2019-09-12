
public class Drink extends Food {
		public Drink(String name, Double price){
		this.name = name;
		this.price=price;
		
	}

		@Override
		public String toString() {
			return "Drink [name=" + name + ", price=" + price + "]";
		}
		
}
