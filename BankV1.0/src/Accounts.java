public class Accounts {
	
	public static void main(String[] args) {
		//create two new objects to test
		Account marc = new Account("Marc",3000.0);
		Account pepito = new Account("Pepito",0.0);
		
		/*transfer(marc,200.0,pepito);*/
		
		/*marc.deposit(1000000.0);
		personalCredit(marc);
		personalCredit(pepito);*/
		
	}
	
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

      // afegeix un mètode nou
      public static void yourMethod () {
		
	}

}