public class Account {
	
	    private double balance;
	    private BankClient owner;
	 
	    public Account(BankClient owner, double balance) {
	        this.balance = balance;
	        this.owner = owner;
	        //Modify the client class of the account's owner
	      	this.owner.changeClass(Accounts.controlClientClass(this));
	        
	    }
	 	
	    public void deposit(double amount) {
	        balance += amount;
	        this.owner.changeClass(Accounts.controlClientClass(this));
	    }
	 
	    public void withdrawal(double amount) {
	        balance -= amount;
	        this.owner.changeClass(Accounts.controlClientClass(this));
	    }
	 
	    public double getBalance() {
	        return balance;
	    }
	 
	    public BankClient getOwner() {
			return owner;
		}

	    public void setOwner(BankClient owner) {
			this.owner = owner;
		}

	    public void setBalance(double balance) {
			this.balance = balance;
		}

	    @Override
	    public String toString() {
	        return owner + " balance: " + balance;
	    }

}
