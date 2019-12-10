import java.util.ArrayList;

public class BankClient {
	String name;
	int age;
	double height;
	double wheight;
	String clientclass;
	ArrayList<Credit> credits;
		
	//----------overload constructor ---------
	
	public BankClient(String name) {
		this(name,0,0.0,0.0);
	}
	
	public BankClient(String name,int age) {
		this(name,age,0.0,0.0);
	}
	
	public BankClient(String name,double height, double wheight) {
		this(name,0,height,wheight);
	}
	
	public BankClient(String name,int age, double height, double wheight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.wheight = wheight;
		this.clientclass= "";
		this.credits = new ArrayList<Credit>();
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
	//change the client class
	public void changeClass(String clientClass) {
		this.setClientclass(clientClass);
	}

	
	
	/*@Override
	public String toString() {
		return "BankClient [name=" + name + ", age=" + age + ", height=" + height + ", wheight=" + wheight
				+ ", clientclass=" + clientclass + ", credits=" + credits + "]";
	}*/

	public void addCredit(Credit credit) {
		this.credits.add(credit);
	}

	//-----------Getters and Setters----------------------------
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

	public String getClientclass() {
		return clientclass;
	}

	public void setClientclass(String clientclass) {
		this.clientclass = clientclass;
	}
	public ArrayList<Credit> getCredits() {
		return credits;
	}

	public void setCredits(ArrayList<Credit> credits) {
		this.credits = credits;
	}
	//-------------------------------------------------

}
