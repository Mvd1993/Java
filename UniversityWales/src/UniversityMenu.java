import java.util.ArrayList;

public class UniversityMenu {
	ArrayList<FirstDish> firsts;
	ArrayList<SecondDish> seconds;
	ArrayList<Dessert> desserts;
	ArrayList<Drink> drinks;
	
	public UniversityMenu() {
		firsts = new ArrayList<FirstDish>();
		seconds = new ArrayList<SecondDish>();
		desserts = new ArrayList<Dessert>();
		drinks = new ArrayList<Drink>();
	}

	public void addFirsts(FirstDish first) {
		firsts.add(first);
	}
	public void addSeconds(SecondDish second) {
		seconds.add(second);
	}
	public void addDesserts(Dessert dessert) {
		desserts.add(dessert);
	}
	public void addDrinks(Drink drink) {
		drinks.add(drink);
	}
	



	
	
}
