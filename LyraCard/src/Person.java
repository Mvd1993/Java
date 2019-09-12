import java.util.ArrayList;

public class Person {
	String name;
	int age;
	double height;
	double wheight;
	MyDate bornDate;
	ArrayList<LyyraCard> lyyraCard;
	
		
	//----------overload constructor ---------
	
	public Person(String name) {
		this(name,0,0.0,0.0,new MyDate(),new ArrayList<LyyraCard>());
	}
	
	public Person(String name,int age) {
		this(name,age,0.0,0.0,new MyDate(),new ArrayList<LyyraCard>());
	}
	
	public Person(String name,double height, double wheight) {
		this(name,0,height,wheight,new MyDate(),new ArrayList<LyyraCard>());
	}
	
	public Person(String name,int age, double height, double wheight,MyDate bornDate, ArrayList<LyyraCard> lyyraCard) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.wheight = wheight;
		this.bornDate = new MyDate();
		this.lyyraCard = new ArrayList<LyyraCard>();	}
	
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
	 //Add a lyyracard to the array of lyyra cards
	public void addLyyraCard(LyyraCard card) {
		this.lyyraCard.add(card);
	}

	
	
	
	
	
	
	
	
	/*-------------------------------------------------*/
			
	//toString method


	

	/*@Override
	
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", wheight=" + wheight + ", bornDate="+ bornDate + ", lyyraCard=" + lyyraCard + "]";
	}*/
	
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

	public MyDate getBornDate() {
		return bornDate;
	}

	public void setBornDate(MyDate bornDate) {
		this.bornDate = bornDate;
	}

	public ArrayList<LyyraCard> getLyyraCard() {
		return lyyraCard;
	}

	public void setLyyraCard(ArrayList<LyyraCard> lyyraCard) {
		this.lyyraCard = lyyraCard;
	}

	//Getters and Setters

	
}