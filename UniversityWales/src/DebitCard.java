
public class DebitCard extends Card {

	public DebitCard(Double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	
	public void pay(Double amount) {
	    // write code here
	        if (this.balance >= amount){
	            this.balance -= amount;
	            this.transaction.add(amount);
	        }
	        else System.out.println("not enough money in your card");
	    }

	@Override
	public String toString() {
		return "DebitCard [balance=" + balance + ", transaction=" + transaction;
	}
	
	
	
}
