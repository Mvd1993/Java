
public class LyyraCard {
	private double balance;
	private Person person;
	private MyDate renovationDate;
	private MyDate expirationDate;

	public LyyraCard(double balance, Person person) {
	    this.balance = balance;
	    this.person = person;
	    this.renovationDate = new MyDate();
	    this.expirationDate = new MyDate();
	    expirationDate.addYears(5);
	    person.addLyyraCard(this);
	}

	public double balance() {
		return this.balance;
	}

	public void loadMoney(double amount) {
		this.balance += amount;
	}
	public void extractMoney(double amount) {
		this.balance -= amount;
	}

	public boolean pay(double amount){
	       // the method checks if the balance of the card is at least the amount given as parameter
	       // if not, the method returns false meaning that the card could not be used for the payment
	       // if the balance is enough, the given amount is taken from the balance and true is returned
		if (amount <= this.balance) {
			this.extractMoney(amount);
			return true;
		}
		return false;
	}
	 //---------------Getters, Setters and ToString--------------

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public MyDate getRenovationDate() {
		return renovationDate;
	}

	public void setRenovationDate(MyDate renovationDate) {
		this.renovationDate = renovationDate;
	}

	public MyDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(MyDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {
		return "LyyraCard [balance=" + balance + ", person=" + person + ", renovationDate=" + renovationDate
				+ ", expirationDate=" + expirationDate + "]";
	}
	
	  
}
