import java.util.ArrayList;
import java.util.Scanner;

public class Accounts {
	
	
	
      //transfereix un valor de un compte a un altre amb un return de        //l’operació
	public static void transfer (Account owner, double amount, Account destination) {
		owner.withdrawal(amount);
		destination.deposit(amount);
		System.out.println(owner.getOwner() + " transfer " + amount + " € to  " + destination.getOwner());
		/* check if the transfer is correct
		System.out.println(owner);
		System.out.println(destination);
		*/
	}
	
	// depèn del valor del compte decideix si es pot concedir un crèdit o //no a l’usuari
	public static boolean personalCredit  (Account owner) {			
		return owner.getBalance() > 10000.0;
			
	}

      // control the type of client based in his account's balance
    public static String controlClientClass(Account account) {
    	if (account.getBalance()<1000) {
    		return "D";
    	  }
    	else if (account.getBalance()<10000) {
    		return "C";
    	  }
    	else if (account.getBalance()<50000) {
    		return "B";
    	  }
    	return "A";
	}
    
    //check the terms of a credit
    public static ArrayList<Double> terms(BankClient client) {
		
    	ArrayList<Double> creditComission = new ArrayList<Double>();
    	double totalCredit=0.0;
		double comission=0.0;
		if (client.getClientclass().equals("A")) {
			creditComission.add(100000.0);
			creditComission.add(5.0);
		}
		else if (client.getClientclass().equals("B")) {
			creditComission.add(50000.0);
			creditComission.add(10.0);
		}
		else if (client.getClientclass().equals("C")) {
			creditComission.add(20000.0);
			creditComission.add(20.0);
		}
		if (creditComission.isEmpty()) {
			System.out.println("credit DENIED");
			
		}
		else {
			System.out.println("Max credit " + creditComission.get(0) + " € " + creditComission.get(1) + " % comission");
		}
			return creditComission;
	}
    
    //ask a client for a credit
    public static void askCredit(BankClient client) {
    	ArrayList<Double> conditions = terms(client);
    	Double maxAmount = conditions.get(0);
    	Double comission = conditions.get(1);
    	Scanner reader = new Scanner(System.in);
    	System.out.println("how much do you want?");
    	Double amount= reader.nextDouble();
    	while (amount > maxAmount){
    		System.out.println("this credit exceed the max amount of credit, type a lower credit");
    		amount = reader.nextDouble();
    	}
    	System.out.println("do you want the credit?");
    	
    	String response= reader.nextLine();
    	response= reader.nextLine();
    	if (response.equals("yes")){
    		createCredit(client, amount, comission);
    	}
    }
    
    public static void createCredit(BankClient owner, double amount,double comission) {
    	//System.out.println(owner);
    	//System.out.println(amount + "" + comission);
    	Credit cotxe = new Credit(amount,comission, owner);
    	//owner.addCredit(cotxe);
    	owner.credits.add(cotxe);
    	System.out.println(cotxe);
    	
    }
    
    
    
    
    
}