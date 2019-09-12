import java.sql.Date;
import java.util.ArrayList;

public class Person {
	String name;
	String lastName;
	int age;
	double height;
	double wheight;
	Date birthday;
	ArrayList<Pet> pets;
	ArrayList<Card> cards;
		
	//----------overload constructor ---------
	
	public Person(String name) {
		this(name,0,0.0,0.0,new ArrayList<Pet>(),new ArrayList<Card>());
	}
	
	public Person(String name,int age) {
		this(name,age,0.0,0.0,new ArrayList<Pet>(),new ArrayList<Card>());
	}
	
	public Person(String name,double height, double wheight) {
		this(name,0,height,wheight,new ArrayList<Pet>(),new ArrayList<Card>());
	}
	
	public Person(String name,int age, double height, double wheight, ArrayList<Pet> pets) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.wheight = wheight;
		this.pets = pets;
		this.cards = new ArrayList<Card>();
	}
	public Person(String name,int age, double height, double wheight, ArrayList<Pet> pets, ArrayList<Card> cards) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.wheight = wheight;
		this.pets = pets;
		this.cards = cards;
	}
	
	//-------------printperson------------
	public void printPerson() {
		System.out.println(this.toString());
	}
	
	//increment the age of the object given
	public void becomeOlder() {
		this.becomeOlder(1);
	}
	
	public void becomeOlder(int years) {
		this.age = this.age + years;
	}
	//check if the object is adult
	public boolean isAdult() {
		if (this.age < 18) {
			return false;
		}
		return true;
	}
	
	//calculate the body mass index
	public double bodyMassIndex() {
		double heightDivideHundred = this.height/100;
		return wheight/(heightDivideHundred * heightDivideHundred);
	}
	
	public void showBodyMassIndex() {
		System.out.println(bodyMassIndex());
	}
	
	/*-------------------------------------------------*/
			
	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age + ", height=" + height + ", wheight="
				+ wheight + ", birthday=" + birthday + ", pets=" + pets + ", cards=" + cards + "]";
	}

	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWheight() {
		return wheight;
	}
	public void setWheight(double wheight) {
		this.wheight = wheight;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public ArrayList<Pet> getPets() {
		return pets;
	}

	public void setPets(Pet pet) {
		this.pets.add(pet);
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(Card cards) {
		this.cards.add(cards);
	}
	
	
	
}
