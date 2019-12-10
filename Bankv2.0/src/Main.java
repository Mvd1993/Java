
public class Main {
	public static void main(String[] args) {
		//create two new objects to test
		BankClient marc = new BankClient("Marc");
		BankClient pepito = new BankClient("Pepito");
		Account marc_account = new Account(marc,3000.0);
		Account pepito_account = new Account(pepito,0.0);
		System.out.println(marc);
		System.out.println(pepito);
		
		marc_account.deposit(1000000.0);
		Accounts.askCredit(marc);
	}
}
