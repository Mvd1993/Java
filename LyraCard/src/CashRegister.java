public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        // at start the register has 1000 euros
    	this.cashInRegister=1000;
    	this.economicalSold=0;
    	this.gourmetSold=0;
    }
    
    //Overload pay methods that:
    // if the given cash is at least the price of the lunch:
    //    the price of lunch is added to register
    //    the amount of the sold lunches is incremented by one
    //    the method returns cashGiven - lunch price
    // if not enough money is given, all is returned and nothing else happens
    public double pay(double cashGiven, double price) {
    	if (cashGiven >= price) {
    		cashInRegister += price;
    		return cashGiven-price;
    	}
    	System.out.println("not enough money");
    	return cashGiven;
    }
    
    public double pay(double cashGiven, double price, String type) {
    	if (cashGiven >= price) {
    		cashInRegister += price;
    		if (type.equals("economicalSold")) {
    			economicalSold +=1;
    		}
    		if (type.equals("gourmetSold")) {
    			gourmetSold +=1;
    		}
    		
    		return cashGiven-price;
    	}
    	System.out.println("not enough money");
    	return cashGiven;
    }
    public double payEconomical(double cashGiven) {
        // the price of the economical lunch is 2.50 euros
       
    	return pay(cashGiven, 2.5, "economicalSold");
    }
    
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
    	double price = 2.5;
        // if the balance of the card is at least the price of the lunch:
    	if (price <= card.balance()) {
    		//    the amount of sold lunches is incremented by one
            //    the method returns true
    		card.extractMoney(price);
    		economicalSold += 1 ;
    		return true;
    	}
       
        // if not, the method returns false
    	return false;
    }

    
    public double payGourmet(double cashGiven) {
        // the price of the gourmet lunch is 4.00 euros
       
    	return pay(cashGiven, 4, "gourmetSold");
    }
    
    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
    	double price = 4.0;
        // if the balance of the card is at least the price of the lunch:
    	if (price <= card.balance()) {
    		//    the amount of sold lunches is incremented by one
            //    the method returns true
    		card.extractMoney(price);
    		gourmetSold += 1 ;
    		return true;
    	}
       
        // if not, the method returns false
    	return false;
   
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
    	if (sum >= 0) {   
    		card.loadMoney(sum);
    		cashInRegister += sum;
    	}
    }
    	  
        

        

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
  