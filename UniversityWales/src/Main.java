
public class Main {
	
	public static void main(String[] args) {
		
		//Student test
		Student marc = new Student("Marc", new Pet("pepito"), new Apartment(2,2,2) );
		System.out.println(marc.getApartment());
		 
		
		// Card TEST
		DebitCard card = new DebitCard(200.0);
		marc.setCards(card);
		System.out.println(card);
		card.loadMoney(50);
		System.out.println(card);
		card.loadMoney(100);
		System.out.println(card);
		card.pay(140.0);
		System.out.println(card);
		card.pay(300.0);
		System.out.println(card);
		System.out.println(marc);
		
		// Food Test
		Drink drink = new Drink("cola",2.5);
		FirstDish dish = new FirstDish("macarroni",5.5);
		SecondDish secondDish = new SecondDish("pulledpork",6.0);
		Dessert dessert = new Dessert("jelly",2.0);
		
		System.out.println(drink);
		System.out.println(dish);
		System.out.println(secondDish);
		System.out.println(dessert);
		
		// Menu test
		UniversityMenu menu =  new UniversityMenu();
		menu.addDrinks(drink);
		menu.addFirsts(dish);
		menu.addSeconds(secondDish);
		menu.addDesserts(dessert);
		
		System.out.println(menu);
		
	}
}
