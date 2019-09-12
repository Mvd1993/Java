
public class Dessert extends Food{
		public Dessert(String name, Double price){
		this.name = name;
		this.price=price;
		
	}

		@Override
		public String toString() {
			return "Dessert [name=" + name + ", price=" + price + "]";
		}
		
}
