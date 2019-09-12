import java.util.ArrayList;

public class Card {


    double balance;
    ArrayList<Double> transaction;

    public Card(Double balance) {
       this.balance =  balance;
       this.transaction = new ArrayList<Double>();
    }

    public String toString() {
        // write code here
        return "The card has "+balance+" euros";
    }
 
    public void loadMoney(double amount) {
    // write code here
        if (amount >= 0){
            this.balance += amount;
            if (this.balance > 300){
                this.balance = 300;
            }    
        }
        transaction.add(amount);
    }

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public ArrayList<Double> getTransaction() {
		return transaction;
	}

	public void setTransaction(ArrayList<Double> transaction) {
		this.transaction = transaction;
	}
   
}